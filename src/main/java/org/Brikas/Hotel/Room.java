package org.Brikas.Hotel;

import java.io.Serializable;
import java.util.LinkedList;

public class Room implements Serializable {
    private int number;
    public boolean isRoomBooked = false ; // room is empty by default
    public LinkedList<Guest> allGuestsWhoVisited = new LinkedList<>();

    public Room(){}

    public Room(int number, boolean roomStatus) {
        this.number = number;
        this.isRoomBooked = roomStatus;
        //this.allGuestsWhoVisited = allGuestsWhoVisited;
    }

    public void setRoomBooked(boolean isRoomBooked) {
        this.isRoomBooked = isRoomBooked;
    }
    public boolean getRoomBooked(){
        return isRoomBooked;
    }
    public int getRoomNumber(){
        return number;
    }
    public void setRoomGuest(Guest roomBookedBy) { // auto setter
        this.roomBookedBy = roomBookedBy;
    }
    public Guest getRoomGuest() {
        return roomBookedBy;
    }
    public LinkedList<Guest> getAllGuestsWhoVisited() {
        return allGuestsWhoVisited;
    }
    public void addGuestToTheList(Guest guest){
        allGuestsWhoVisited.add(guest);
    }

    public Guest roomBookedBy ;

    @Override
    public String toString(){
        return "Room " + number;
    }
}
