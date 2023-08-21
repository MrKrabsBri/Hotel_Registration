package org.Brikas.Hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class ClientManager {
    int number;
    boolean isRoomEmpty;

    Room room = new Room( number, isRoomEmpty);

    LinkedList<Guest>listOfAllGuests = new LinkedList<>();
    RegistrationHistory registrationRegistry = new RegistrationHistory(listOfAllGuests);


    public void registerGuest(/*Guest guest,*/ Room room){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a guest you want to register: ");
        String name = scanner.nextLine();//guest.getName();
        System.out.println("Enter the surname of a guest you want to register: ");
        String surname = scanner.nextLine();//guest.getName();
        scanner.close();
        Guest guest = new Guest();
        guest.setName(name);
        guest.setSurname(surname);
        System.out.println("OBJ vardas yra : " + guest.getName() + " " + guest.getSurname());
        room.setRoomStatus(true);// Room is set to : Not available.
        registrationRegistry.addToGuestRegistry(listOfAllGuests,guest);
        System.out.println(listOfAllGuests);
    }



}
