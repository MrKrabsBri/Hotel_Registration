package org.Brikas.Hotel;

import java.util.Scanner;
import java.util.LinkedList;

public class MenuManager {

    Room hotelRoom;
    //static LinkedList<Room>rooms = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

   // GuestManager guestManager = new GuestManager(scanner);

    public static void runMenu(String filename, LinkedList<Room>rooms) {

        Guest hotelGuest = new Guest();
        int selection = 0;

        //int selection;
        do {
            displayMenu();

            if (scanner.hasNextInt()) {
                selection = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (selection) {
                    case 1:
                        System.out.println("Check-in selected.");
                        GuestManager.checkInGuest(rooms);
                        //SavingManager.writeToFile();

                        // You can modify this to take input for the guest's details
                        break;
                    case 2:
                        System.out.println("Check-out selected.");
                        GuestManager.checkOutGuestByName(rooms);

                        // Add your function 2 implementation
                        break;
                    // Add cases for other functions
                    case 3:
                        System.out.println("Showing list of booked rooms and their guests");
                        System.out.println(RoomManager.listOfBookedRooms(rooms));//istrink po to jei lentele rodo gerai
                        System.out.format("%-30s%-30s%n", "Room number", "Guest Name");//print header
                        System.out.println(new String(new char[93]).replace('\0', '-')); // Adjust length as needed
                        //added sita
                        for (Room hotelRoom: rooms) {

                            if(hotelRoom.isRoomBooked){ // if booked


                                System.out.format("%-30s %-30s%n", hotelRoom,  hotelRoom.getRoomGuest());//prints row
                                // System.out.println(new String(new char[93]).replace('\0', '-')); // print separator // Adjust length as needed


                                //System.out.println("Room " + hotelRoom.getRoomNumber() +" - Booked by : "+ hotelRoom.getRoomGuest());

                                //bookedRooms.add(hotelRoom);
                                //ALSO SHOW WHO LIVES IN THE ROOMS
                            }

                        }
                        System.out.println(new String(new char[93]).replace('\0', '-')); // Adjust length as needed
                        // Add your function 3 implementation
                        break;
                    case 4:
                        System.out.println("Guest history of room and current status selected");
                        //System.out.println(rooms.get(0).getAllGuestsWhoVisited());
          //             RegistrationHistoryManager.getNumberIndex(rooms)
                        RegistrationHistoryManager.getRegisteredGuestList(rooms);


                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid choice.");
                scanner.nextLine(); // Consume the invalid input
                continue; // Go back to the beginning of the loop
            }
        } while (selection != 5);
        SavingManager.writeToFile(filename,rooms);
        scanner.close();
    }


    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Check-in guest");
        System.out.println("2. Check-out guest");
        System.out.println("3. Show list of booked rooms");
        System.out.println("4. Show guest history of specified room and get it's status");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}

//            int selection = scanner.nextInt();
//            scanner.nextLine();
//            Guest hotelGuest = new Guest();
//            int selection;
//
//            if (scanner.hasNextInt()) {
//                selection = scanner.nextInt();
//                scanner.nextLine(); // Consume the newline character
//            }
//            else {
//                System.out.println("Invalid input. Please enter a valid choice.");
//                scanner.nextLine(); // Consume the invalid input
//                //continue; // Go back to the beginning of the loop
//            }
//
//            switch(selection){
//                case 1:
//                    for (Room room: rooms){
//                       if(room.getRoomBooked()==false){// if room is free to be booked
//              //             hotelGuest = guestManager.checkInGuest(rooms,room,GuestManager.registerGuest());// Guest is assigned to the room
//                           guestManager.checkInGuest(rooms,room,GuestManager.registerGuest());
//                           System.out.println("Check-in successful!");
//             /*test */     System.out.println(room.getRoomGuest());
//                           System.out.println(room.isRoomBooked());
//
//                           RegistrationHistoryManager.addToGuestRegistry(listOfAllGuestsOfRoom,hotelGuest);// gal bad
//                           System.out.println("room status: " + room.getRoomBooked());
//                           //break;
//                            //roomToBook = room;
//                          // room.
//                           break;
//                       }
//
//                    }
//                    break;
//                case 2:
//                    System.out.println("checked-out");
//                    break;
//                case 3:
//                    System.out.println("displaying booked rooms");
//                    break;
//                case 4:
//                    System.out.println("displaying booked room history");
//                    break;
//                case 5:
//                    System.out.println("Exiting program");
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("placeholder");



