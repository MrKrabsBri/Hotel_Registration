package org.Brikas.Hotel;

import java.util.LinkedList;

public class RegistrationHistory {

    LinkedList<Guest> listOfAllGuests ;//= new LinkedList<>();
    //Guest guest = new Guest();

    public RegistrationHistory(LinkedList<Guest> listOfAllGuests) {// constructor
        this.listOfAllGuests = listOfAllGuests;
    }

    public void addToGuestRegistry(LinkedList<Guest>listOfAllGuests,Guest guest){//LinkedList<Guest>guests
        listOfAllGuests.add(guest);
    }

}