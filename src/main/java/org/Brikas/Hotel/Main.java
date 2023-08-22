package org.Brikas.Hotel;



import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    String databaseName = "jdbchoteldb"; //* for use of DB
//    ConnectAndExecuteMySQL(databaseName); //* for use of DB
        boolean isRoomTaken = false;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        LinkedList<Guest>listOfAllGuestsOfRoom = new LinkedList<>();
        LinkedList<Room>listOfAllBookedRooms = new LinkedList<>();

        Room room1 = new Room(1,isRoomTaken);
        Room room2 = new Room(2,isRoomTaken);
        Room room3 = new Room(3,isRoomTaken);
        Room room4 = new Room(4,isRoomTaken);
        Room room5 = new Room(5,isRoomTaken);
        //BrikasHotel brikoHotel = new BrikasHotel(room1,room2,room3,room4,room5);

        GuestManager guestManager = new GuestManager(scanner);
        LinkedList<Room> rooms = new LinkedList<>();//cia gal atskira funkcija


        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        System.out.println(rooms.get(0).isRoomBooked);
        System.out.println(rooms.get(1).isRoomBooked);
        System.out.println(rooms.get(2).isRoomBooked);
        System.out.println(rooms.get(3).isRoomBooked);
        System.out.println(rooms.get(4).isRoomBooked);

        System.out.println(rooms);

//TESTING AREA+++++++++++++++++++++++++++++++++++++
        //testing roommanager
       // GuestManager guestManager1 = new GuestManager(scanner);

        System.out.println(RoomManager.listOfBookedRooms(rooms));
        System.out.println(RoomManager.findEmptyRoom(rooms));

        rooms.get(3).setRoomBooked(true);//4 pasidaro booked
        rooms.get(1).setRoomBooked(true);//2 pasidaro booked
        System.out.println(rooms.get(3).isRoomBooked);
        System.out.println(rooms.get(1).isRoomBooked+ "@@@");

        //checking in a guest

        GuestManager.checkInGuest(rooms);
        System.out.println(RoomManager.listOfBookedRooms(rooms));

        //guestManager.checkInGuest(rooms,RoomManager.findEmptyRoom(rooms),GuestManager.registerGuest());
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);

        GuestManager.checkInGuest(rooms);
        System.out.println(RoomManager.listOfBookedRooms(rooms));

//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);

        GuestManager.checkOutGuestByName(rooms);
        System.out.println(RoomManager.listOfBookedRooms(rooms));
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);
        GuestManager.checkOutGuestByName(rooms);
        System.out.println(RoomManager.listOfBookedRooms(rooms));
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);

        GuestManager.checkInGuest(rooms);
        System.out.println(RoomManager.listOfBookedRooms(rooms));
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);
//        GuestManager.checkInGuest(rooms);
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);


        //System.out.println(RoomManager.listOfBookedRooms(rooms));
  //      guestManager.checkInGuest(rooms,RoomManager.findEmptyRoom(rooms),guest);
        //System.out.println(RoomManager.listOfBookedRooms(rooms));
       // System.out.println("----");
        //System.out.println(RoomManager.listOfBookedRooms(rooms));
      //  rooms.get(2).setRoomBooked(true);//3 pasidaro booked
       // rooms.get(0).setRoomBooked(true);//1 pasidaro booked
       // System.out.println("----");
      //  guestManager.checkInGuest(rooms,RoomManager.findEmptyRoom(rooms));
        //System.out.println(RoomManager.listOfBookedRooms(rooms));



        //+++++++++++++++++++++++++++++++++++++++++



        Room roomToBook = new Room();
        //-------------------------------------------
        // Menu starts here
//        while (!exit){
//            System.out.println("Welcome to Hotel menu!");
//            System.out.println("Please select further step:");
//            System.out.println("---------------------------------------");
//            System.out.println("1. Check-in a new guest");
//            System.out.println("2. Check-out a guest");
//            System.out.println("3. Display booked rooms");
//            System.out.println("4. Display booking history of a room");
//            System.out.println("5. Exit");
//            System.out.println("Enter your choice: ");
//
////            int selection = scanner.nextInt();
////            scanner.nextLine();
//            Guest hotelGuest = new Guest();
//            int selection;
//            if (scanner.hasNextInt()) {
//                selection = scanner.nextInt();
//                scanner.nextLine(); // Consume the newline character
//            } else {
//                System.out.println("Invalid input. Please enter a valid choice.");
//                scanner.nextLine(); // Consume the invalid input
//                continue; // Go back to the beginning of the loop
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
//
//
//
//
//            }
//
//        }
        scanner.close();//close scanner here

//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);


//        Guest hotelGuest = new Guest();
//
//        clientManager.registerGuest(rooms.get(0));
//        clientManager.registerGuest(rooms.get(2));
//        clientManager.registerGuest(rooms.get(3));
//
//        System.out.println(rooms.get(0).isOccupied);
//        System.out.println(rooms.get(1).isOccupied);
//        System.out.println(rooms.get(2).isOccupied);
//        System.out.println(rooms.get(3).isOccupied);
//        System.out.println(rooms.get(4).isOccupied);


    }




}