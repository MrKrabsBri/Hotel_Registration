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

    //RegistrationHistoryManager registrationRegistry = new RegistrationHistoryManager(room, listOfAllGuests);

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

        if(RoomManager.listOfBookedRooms(listOfRooms).size() != (listOfRooms.size())){

            Guest guestToCheckIn = registerGuest();
            Room roomToCheckInto = RoomManager.findEmptyRoom(listOfRooms);

            roomToCheckInto.setRoomGuest(guestToCheckIn);
            roomToCheckInto.setRoomBooked(true);
            RegistrationHistoryManager.addToGuestRegistry(roomToCheckInto,guestToCheckIn);
            //roomToCheckInto.addGuestToTheList(guestToCheckIn); GAL GERAS?
            System.out.println(roomToCheckInto.getRoomGuest() + " was checked-in, room " +
                    roomToCheckInto + " is now " + roomToCheckInto.getRoomBooked());

        }
        else System.out.println("All rooms are currently booked");
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

        Room roomToCheckOut = roomManager.findRoomWithName(bookedRooms,guestToCheckOut);
            if (roomToCheckOut == null){ // check exceptions so it doesnt show.
                System.out.println("No room was found with that guest name");
            }

//                System.out.println("found a matching room " + roomToCheckOut.getRoomNumber() + " name " +
//                roomToCheckOut.getRoomGuest().getSurname() + " surname " + roomToCheckOut.getRoomGuest().getSurname());

//        System.out.println("test line");
//        System.out.println("room to check out "+roomToCheckOut.getRoomNumber());


        if (roomToCheckOut != null){
            roomToCheckOut.setRoomGuest(null);
            System.out.println("test line");
            roomToCheckOut.setRoomBooked(false);
            System.out.println("test line");
            System.out.print(guestToCheckOut + " was Checked-Out, room " +
                    roomToCheckOut + " is now ");
                    //+ roomToCheckOut.getRoomBooked());
                    if (roomToCheckOut.getRoomBooked()){
                        System.out.println("booked");
                    }
                    else System.out.println("available");
        }




    }

}




