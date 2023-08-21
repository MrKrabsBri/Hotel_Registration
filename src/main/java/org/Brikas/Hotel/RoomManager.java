package org.Brikas.Hotel;

import java.util.LinkedList;

public class RoomManager {

// checks which rooms are empty
    // Also sort the list!!!!

    LinkedList<Room>bookedRooms = new LinkedList<>();

    public void listOfBookedRooms(LinkedList<Room>rooms){

    }

    public void sortRoomList(){}

    public void addARoomToTheList(LinkedList<Room>rooms, Room room){
        rooms.add(room);
    }

    public void displayRoomList(LinkedList<Room>bookedRooms ){
        for (Room room:bookedRooms) {
            System.out.println("Number : " + room.getRoomNumber() + " ;");
        }
    }
}
