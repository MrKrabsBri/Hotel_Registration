package org.Brikas.Hotel;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MenuManager {

    Room hotelRoom;
    //static LinkedList<Room>rooms = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

   // GuestManager guestManager = new GuestManager(scanner);

    public static void runMenu(LinkedList<Room>rooms) {

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

                        // You can modify this to take input for the guest's details
                        break;
                    case 2:
                        System.out.println("Check-out selected.");
                        GuestManager.checkOutGuestByName(rooms);

                        // Add your function 2 implementation
                        break;
                    // Add cases for other functions
                    case 3:
                        System.out.println("Show list of booked rooms selected.");
                        System.out.println(RoomManager.listOfBookedRooms(rooms));

                        // Add your function 3 implementation
                        break;
                    case 4:
                        System.out.println("Function 4 selected.");
                        System.out.println(rooms.get(0).getAllGuestsWhoVisited());

                        // Add your function 4 implementation
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

        scanner.close();
    }


    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Check-in guest");
        System.out.println("2. Check-out guest");
        System.out.println("3. Show list of booked rooms");
        System.out.println("4. Show guest history of specified room and get it's status");
        // Add options for other functions
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



