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
    Room room = new Room( number, isRoomEmpty);

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

    public static void checkInGuest(LinkedList<Room>listOfRooms) {

        Guest guestToCheckIn = registerGuest();
        Room roomToCheckInto = RoomManager.findEmptyRoom(listOfRooms);

        roomToCheckInto.setRoomGuest(guestToCheckIn);
        roomToCheckInto.setRoomBooked(true);
        System.out.println(roomToCheckInto.getRoomGuest() + " was checked-in, room " +
                roomToCheckInto + " is now " + roomToCheckInto.getRoomBooked());

    }
    //checking out room by room number
    public static void checkOutGuestByName (LinkedList<Room>listOfRooms) { //passink visus kambarius

        System.out.println("Enter the name of a guest you want to Check-Out: ");
        String nameToCheckOut = scanner.nextLine();
        System.out.println("Enter the surname of a guest you want to Check-Out: ");
        String surnameToCheckOut = scanner.nextLine();
        Guest guestToCheckOut = new Guest(nameToCheckOut,surnameToCheckOut);
        RoomManager roomManager = new RoomManager();
        LinkedList<Room>bookedRooms = roomManager.listOfBookedRooms(listOfRooms);
       // System.out.println(bookedRooms);//****************
        System.out.println("test line");

        Room roomToCheckOut = roomManager.findRoomWithName(bookedRooms,guestToCheckOut);

                System.out.println("found a matching room " + roomToCheckOut.getRoomNumber() + " name " +
                roomToCheckOut.getRoomGuest().getSurname() + " surname " + roomToCheckOut.getRoomGuest().getSurname());
        System.out.println("test line");
        System.out.println("room to check out "+roomToCheckOut.getRoomNumber());

        roomToCheckOut.setRoomGuest(null);
        System.out.println("test line");
        roomToCheckOut.setRoomBooked(false);
        System.out.println("test line");
                    System.out.println(guestToCheckOut + " was Checked-Out, room " +
                    roomToCheckOut + " is now " + roomToCheckOut.getRoomBooked());


    }

}




