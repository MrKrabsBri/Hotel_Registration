package org.Brikas.Hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class ClientManager {
    private final Scanner scanner;
    public ClientManager(Scanner scanner){
        //scanner = new Scanner(System.in);
        this.scanner = scanner;
    }
//    public void closeScanner(){
//        scanner.close();
//    }

    int number;
    boolean isRoomEmpty;


    LinkedList<Guest>listOfAllGuests = new LinkedList<>();
    Room room = new Room( number, isRoomEmpty, listOfAllGuests);

    RegistrationHistory registrationRegistry = new RegistrationHistory(room, listOfAllGuests);

    RoomManager roomManager = new RoomManager();
    LinkedList<Room>rooms = new LinkedList<>();//booked rooms


    public void registerGuest(Room room){
        System.out.println("Enter the name of a guest you want to register: ");
        String name = scanner.nextLine();//guest.getName();
        System.out.println("Enter the surname of a guest you want to register: ");
        String surname = scanner.nextLine();//guest.getName();
        Guest guest = new Guest();
        guest.setName(name);
        guest.setSurname(surname);
        System.out.println("OBJ vardas yra : " + guest.getName() + " " + guest.getSurname());

        room.setRoomGuest(guest);// for booked rooms list table
        room.setRoomStatus(true);// Room is set to : Booked.
        registrationRegistry.addToGuestRegistry(listOfAllGuests,guest);// for room history
        //System.out.println("all guests : " + listOfAllGuests);
        //System.out.println("room booked by: " + room.roomBookedBy);//
        roomManager.addARoomToTheList(rooms,room);
       // roomManager.displayRoomList(rooms);
           //  ^^^cia tik optional, reikes on call iskviesti
    }



}
