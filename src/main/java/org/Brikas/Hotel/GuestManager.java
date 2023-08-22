package org.Brikas.Hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class GuestManager {
    private static Scanner scanner;
    public GuestManager(Scanner scanner){
        this.scanner = scanner;
    }

    int number;
    boolean isRoomEmpty;

    LinkedList<Guest>listOfAllGuests = new LinkedList<>();
    Room room = new Room( number, isRoomEmpty, listOfAllGuests);

    RegistrationHistoryManager registrationRegistry = new RegistrationHistoryManager(room, listOfAllGuests);

    //RoomManager roomManager = new RoomManager();
    LinkedList<Room>rooms = new LinkedList<>();//booked rooms

    public static Guest registerGuest(){
        System.out.println("Enter the name of a guest you want to register: ");
        String name = scanner.nextLine();//guest.getName();
        System.out.println("Enter the surname of a guest you want to register: ");
        String surname = scanner.nextLine();//guest.getName();
        Guest newGuest = new Guest(name,surname);
        //newGuest.setName(name);
        //newGuest.setSurname(surname);
        System.out.println("OBJ vardas yra : " + newGuest.getName() + " " + newGuest.getSurname());
        return newGuest;
    }

    public void checkInGuest(LinkedList<Room>listOfRooms,Room room, Guest guest){
//        System.out.println("Enter the name of a guest you want to register: ");
//        String name = scanner.nextLine();//guest.getName();
//        System.out.println("Enter the surname of a guest you want to register: ");
//        String surname = scanner.nextLine();//guest.getName();
//        Guest guest = new Guest();
//        guest.setName(name);
//        guest.setSurname(surname);
//        System.out.println("OBJ vardas yra : " + guest.getName() + " " + guest.getSurname());

        System.out.println("##");
        System.out.println(RoomManager.findEmptyRoom(listOfRooms));
        System.out.println("##");
       RoomManager.findEmptyRoom(listOfRooms).setRoomGuest(registerGuest());
        System.out.println(RoomManager.findEmptyRoom(listOfRooms).getRoomGuest());
        System.out.println("##");

        System.out.println(RoomManager.listOfBookedRooms(listOfRooms));
        System.out.println(RoomManager.findEmptyRoom(listOfRooms));

       RoomManager.findEmptyRoom(listOfRooms).setRoomBooked(true);
        System.out.println(RoomManager.findEmptyRoom(listOfRooms));


//       // room.setRoomGuest(newGuest);// for booked rooms list table
//        room.setRoomBooked(true);// Room is set to : Booked.
//        registrationRegistry.addToGuestRegistry(listOfAllGuests,newGuest);// for room history
//        //System.out.println("all guests : " + listOfAllGuests);
//        //System.out.println("room booked by: " + room.roomBookedBy);//
//        roomManager.addARoomToTheBookedList(rooms,room);
//       // roomManager.displayRoomList(rooms);
//           //  ^^^cia tik optional, reikes on call iskviesti
//        return newGuest;
//        return null;
    }



}
