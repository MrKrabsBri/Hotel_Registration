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
        Room room1 = new Room(1,isRoomTaken,listOfAllGuestsOfRoom );
        Room room2 = new Room(2,isRoomTaken,listOfAllGuestsOfRoom );
        Room room3 = new Room(3,isRoomTaken,listOfAllGuestsOfRoom );
        Room room4 = new Room(4,isRoomTaken,listOfAllGuestsOfRoom );
        Room room5 = new Room(5,isRoomTaken,listOfAllGuestsOfRoom );
        //BrikasHotel brikoHotel = new BrikasHotel(room1,room2,room3,room4,room5);

        ClientManager clientManager = new ClientManager(scanner);
        LinkedList<Room> rooms = new LinkedList<>();//cia gal atskira funkcija


        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        System.out.println(rooms.get(0).roomStatus);
        System.out.println(rooms.get(1).roomStatus);
        System.out.println(rooms.get(2).roomStatus);
        System.out.println(rooms.get(3).roomStatus);
        System.out.println(rooms.get(4).roomStatus);

        System.out.println(rooms);


        Room roomToBook = new Room();
        //-------------------------------------------
        // Menu starts here
        while (!exit){
            System.out.println("Welcome to Hotel menu!");
            System.out.println("Please select further step:");
            System.out.println("---------------------------------------");
            System.out.println("1. Check-in a new guest");
            System.out.println("2. Check-out a guest");
            System.out.println("3. Display booked rooms");
            System.out.println("4. Display booking history of a room");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int selection = scanner.nextInt();
            scanner.nextLine();
            Guest hotelGuest = new Guest();

            switch(selection){
                case 1:
                    for (Room room: rooms){
                       if(room.getRoomStatus()==false){// if room is free to be booked
                           hotelGuest = clientManager.registerGuest(room);// Guest is assigned to the room

                           System.out.println("Check-in successful!");
                           RegistrationHistory.addToGuestRegistry(listOfAllGuestsOfRoom,hotelGuest);
                           //break;
                            //roomToBook = room;
                       }
                       break;
                    }
                case 2:
                    System.out.println("checked-out");
                    break;
                case 3:
                    System.out.println("displaying booked rooms");
                    break;
                case 4:
                    System.out.println("displaying booked room history");
                    break;
                case 5:
                    System.out.println("Exiting program");
                    exit = true;
                    break;
                default:


            }



            scanner.close();//close scanner here
        }




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