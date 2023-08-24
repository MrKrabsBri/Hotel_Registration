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

    LinkedList<Room>rooms = new LinkedList<>();//booked rooms

    public static Guest registerGuest(){
        System.out.println("Enter the first name of a guest you want to register: ");
        String name = scanner.nextLine();
        System.out.println("Enter the last name of a guest you want to register: ");
        String surname = scanner.nextLine();
        Guest newGuest = new Guest(name,surname);
        System.out.println("OBJ vardas yra : " + newGuest.getName() + " " + newGuest.getSurname());
        return newGuest;
    }

    public static void checkInGuest(LinkedList<Room>listOfRooms) {

        if(RoomManager.listOfBookedRooms(listOfRooms).size() != (listOfRooms.size())){
            Guest guestToCheckIn = registerGuest();
            Room roomToCheckInto = RoomManager.findEmptyRoom(listOfRooms);
            roomToCheckInto.setRoomGuest(guestToCheckIn);
            roomToCheckInto.setRoomBooked(true);
            RegistrationHistoryManager.addToGuestHistory(roomToCheckInto,guestToCheckIn);
            System.out.println(roomToCheckInto.getRoomGuest() + " was checked-in, " +
                    roomToCheckInto + " is now booked");
        }
        else System.out.println("All rooms are currently booked");
    }

    //checking out room by guest name
    public static void checkOutGuestByName (LinkedList<Room>listOfRooms) {

        System.out.println("Enter the name of a guest you want to Check-Out: ");
        String nameToCheckOut = scanner.nextLine();
        System.out.println("Enter the surname of a guest you want to Check-Out: ");
        String surnameToCheckOut = scanner.nextLine();
        Guest guestToCheckOut = new Guest(nameToCheckOut,surnameToCheckOut);
        RoomManager roomManager = new RoomManager();
        LinkedList<Room>bookedRooms = roomManager.listOfBookedRooms(listOfRooms);
        Room roomToCheckOut = roomManager.findRoomWithName(bookedRooms,guestToCheckOut);

            if (roomToCheckOut == null){
                System.out.println("No room was found with that guest name");
            }

        if (roomToCheckOut != null){
            roomToCheckOut.setRoomGuest(null);
            System.out.println("test line");
            roomToCheckOut.setRoomBooked(false);
            System.out.println("test line");
            System.out.print(guestToCheckOut + " was Checked-Out, room " +
                    roomToCheckOut + " is now ");

                    if (roomToCheckOut.getRoomBooked()){
                        System.out.println("booked");
                    }
                    else System.out.println("available");
        }

    }

}




