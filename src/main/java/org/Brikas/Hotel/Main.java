package org.Brikas.Hotel;



import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//    String databaseName = "jdbchoteldb"; //* for use of DB
//    ConnectAndExecuteMySQL(databaseName); //* for use of DB
        boolean isRoomTaken = false;
        Room room1 = new Room(1,isRoomTaken);
        Room room2 = new Room(2,isRoomTaken);
        Room room3 = new Room(3,isRoomTaken);
        Room room4 = new Room(4,isRoomTaken);
        Room room5 = new Room(5,isRoomTaken);
        //BrikasHotel brikoHotel = new BrikasHotel(room1,room2,room3,room4,room5);

        ClientManager clientManager = new ClientManager();
        LinkedList<Room> rooms = new LinkedList<>();//cia gal atskira funkcija


        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        System.out.println(rooms.get(0).isOccupied);
        System.out.println(rooms.get(1).isOccupied);
        System.out.println(rooms.get(2).isOccupied);
        System.out.println(rooms.get(3).isOccupied);
        System.out.println(rooms.get(4).isOccupied);

        System.out.println(rooms);

        Guest hotelGuest = new Guest();

        clientManager.registerGuest(/*hotelGuest,*/rooms.get(0));
        clientManager.registerGuest(/*hotelGuest,*/rooms.get(2));

       // rooms.get(0).registerGuest(hotelGuest);

        System.out.println(rooms.get(0).isOccupied);
        System.out.println(rooms.get(1).isOccupied);
        System.out.println(rooms.get(2).isOccupied);
        System.out.println(rooms.get(3).isOccupied);
        System.out.println(rooms.get(4).isOccupied);


    }




}