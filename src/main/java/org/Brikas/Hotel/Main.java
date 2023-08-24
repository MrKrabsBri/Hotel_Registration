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

        String filename = "C:/Users/jb196/OneDrive/Desktop/result/bookedRooms.ser";
        // String filename = "data/bookedRooms.ser";
        // String filename = "bookedRooms.ser";
        //"data/bookedRooms.ser";
        // "C:/Users/jb196/OneDrive/Desktop/Java projects/Briko_Hotel/data/bookedRooms.ser";

        //####################################TEST AREA#############################################

//        System.out.println("LOADING HERE");
//
//        LinkedList<Room>loadedRooms = SaveManager.loadRooms(filename);
//
//        System.out.println("Loaded rooms:");
//        for (Room room : loadedRooms) {
//            System.out.println(room);
//        }
//
//        System.out.println("LOADING ENDS");

        //#################################################################################



        LinkedList<Guest>listOfAllGuestsOfRoom = new LinkedList<>();
        LinkedList<Room>listOfAllBookedRooms = new LinkedList<>();

        LinkedList<Room>saveRooms = new LinkedList<>();
        LinkedList<Room>loadRooms = new LinkedList<>();


        Room room1 = new Room(1,isRoomTaken);
        Room room2 = new Room(2,isRoomTaken);
        Room room3 = new Room(3,isRoomTaken);
        Room room4 = new Room(4,isRoomTaken);
        Room room5 = new Room(5,isRoomTaken);
        //BrikasHotel brikoHotel = new BrikasHotel(room1,room2,room3,room4,room5);

        GuestManager guestManager = new GuestManager(scanner); // THIS MUST BE HERE
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
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

//_______________________________TESTING MENU############################################

       MenuManager.runMenu(rooms);
                    //System.out.println(RoomManager.listOfBookedRooms(rooms));
        // SaveManager.saveRooms(RoomManager.listOfBookedRooms(rooms),filename);
                     //LinkedList<Room>loadedRooms = loadRooms(filename);


        System.out.println("cia baigiasi test");
//TESTING AREA+++++++++++++++++++++++++++++++++++++#######################################
        //testing roommanager
       // GuestManager guestManager1 = new GuestManager(scanner);

        System.out.println(RoomManager.listOfBookedRooms(rooms));
        System.out.println(RoomManager.findEmptyRoom(rooms));

        rooms.get(3).setRoomBooked(true);//4 pasidaro booked
        rooms.get(1).setRoomBooked(true);//2 pasidaro booked
        System.out.println(rooms.get(3).isRoomBooked);
        System.out.println(rooms.get(1).isRoomBooked+ "@@@");

        //checking in a guest

//        GuestManager.checkInGuest(rooms);
//        System.out.println(RoomManager.listOfBookedRooms(rooms));

        //guestManager.checkInGuest(rooms,RoomManager.findEmptyRoom(rooms),GuestManager.registerGuest());
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);

//        GuestManager.checkInGuest(rooms);
//        System.out.println(RoomManager.listOfBookedRooms(rooms));
//        GuestManager.checkOutGuestByName(rooms);
//        GuestManager.checkInGuest(rooms);
//        GuestManager.checkOutGuestByName(rooms);
//        GuestManager.checkInGuest(rooms);
//        GuestManager.checkOutGuestByName(rooms);
//        GuestManager.checkInGuest(rooms);
//        GuestManager.checkOutGuestByName(rooms);
//
//        System.out.println(rooms.get(0).getAllGuestsWhoVisited());
//        System.out.println(rooms.get(0).getRoomBooked());
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);

//        GuestManager.checkOutGuestByName(rooms);
//        System.out.println(RoomManager.listOfBookedRooms(rooms));
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);
//        GuestManager.checkOutGuestByName(rooms);
//        System.out.println(RoomManager.listOfBookedRooms(rooms));
//        System.out.println(rooms.get(0).isRoomBooked);
//        System.out.println(rooms.get(1).isRoomBooked);
//        System.out.println(rooms.get(2).isRoomBooked);
//        System.out.println(rooms.get(3).isRoomBooked);
//        System.out.println(rooms.get(4).isRoomBooked);

//        GuestManager.checkInGuest(rooms);
//        System.out.println(RoomManager.listOfBookedRooms(rooms));
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




        //+++++++++++++++++++++++++++++++++++++++++



        Room roomToBook = new Room();
        //-------------------------------------------

        scanner.close();//close scanner here




    }




}