package org.Brikas.Hotel;

import java.util.LinkedList;

public class RegistrationHistory {

    LinkedList<Guest> listOfAllGuests ;//= new LinkedList<>();

    Room room ;
    //Guest guest = new Guest();

    public RegistrationHistory(Room room,LinkedList<Guest> listOfAllGuests) {// constructor
        this.listOfAllGuests = listOfAllGuests;
    }

    public static void addToGuestRegistry(LinkedList<Guest>listOfAllGuests,Guest guest){//LinkedList<Guest>guests
        listOfAllGuests.add(guest);
    }

}
