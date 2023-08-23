package org.Brikas.Hotel;

import java.util.LinkedList;

public class RegistrationHistoryManager {

    LinkedList<Guest> listOfAllGuests ;//= new LinkedList<>();

    Room room ;
    //Guest guest = new Guest();

//    public RegistrationHistoryManager(LinkedList<Guest> listOfAllGuests, Guest guest) {// constructor
//        this.listOfAllGuests = listOfAllGuests;
//    }

    public static void addToGuestHistory(Room room, Guest guest){//LinkedList<Guest>guests

        //gets a List
        room.addGuestToTheList(guest);
        System.out.println("added "+ guest + " to the list of guests of this room: list now is : " +
                room.getAllGuestsWhoVisited()+ "%%%%%%%%%%%%");
    }

}
