package org.Brikas.Hotel;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class RoomManager {

    static LinkedList<Room>bookedRooms = new LinkedList<>();
    static int fullRooms ;
    private LinkedList<Room> rooms = new LinkedList<>();

    public static LinkedList<Room> listOfBookedRooms(LinkedList<Room>rooms){

        bookedRooms.clear();
        for (Room hotelRoom: rooms) {

              if(hotelRoom.isRoomBooked){
                  bookedRooms.add(hotelRoom);
              }
           }
        Collections.sort(bookedRooms, Comparator.comparing(Room::getRoomNumber));//sorting by room number

        if (bookedRooms.size()==0){
            System.out.println("At this moment no room is booked");
        }
        return bookedRooms;
    }

    public static Room findEmptyRoom(LinkedList<Room>listOfRooms){//returns first empty room

        for (Room room:listOfRooms){
            if (!room.isRoomBooked){
                return room;
            }
        }
        System.out.println("all rooms are booked, try again later");
        return null;
    }

    public Room findRoomWithName(LinkedList<Room>bookedRooms, Guest guestToFind){//finds a room of specified guest
        for (Room room: bookedRooms) {
                if(room.getRoomGuest()!= null && room.getRoomGuest().getName().equals(guestToFind.getName()) &&
                             room.getRoomGuest().getSurname().equals(guestToFind.getSurname()))
                return room;
        }
        return null;
    }

}
