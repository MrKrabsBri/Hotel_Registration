package org.Brikas.Hotel;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class RoomManager {

// checks which rooms are empty
    // Also sort the list!!!!
    public void sortRoomList(){}

   static LinkedList<Room>bookedRooms = new LinkedList<>();
    static int fullRooms ;

    // ar tikrai static, kadangi sukuriamas bookedRooms?
    public static LinkedList<Room> listOfBookedRooms(LinkedList<Room>rooms){ // think about array list
        //sitas metodas neprintins, o bus naudojamas maine, su displayInfo();
        bookedRooms.clear();
        for (Room hotelRoom: rooms) {
              if(hotelRoom.isRoomBooked){ // if booked
                  bookedRooms.add(hotelRoom);
              }
           }
        Collections.sort(bookedRooms, Comparator.comparing(Room::getRoomNumber));//sorting by room number

        if (bookedRooms.size()==0){
            System.out.println("At this moment no room is booked");
        }
        //CALL A displayInfo() FUNCTION
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

    public static void addARoomToTheBookedList(LinkedList<Room>rooms, Room room){
        rooms.add(room);
    }

    public void displayRoomList(LinkedList<Room>bookedRooms ){
        for (Room room:bookedRooms) {
            System.out.println("Number : " + room.getRoomNumber() + " ;");
        }
    }

    public Room findRoomWithName(LinkedList<Room>bookedRooms, Guest nameToFind){

        for (Room room: bookedRooms) {
            if(room.getRoomGuest()!= null && room.getRoomGuest().getName().equals(nameToFind)){
                System.out.println("found a matching room " + room.getRoomNumber() + " name " + room.getRoomGuest().getName() +
                 " surname " + room.getRoomGuest().getSurname());
                return room;
            }
        }
        return null;

    }
// po commito istrink jei grisi
    public int findRoomNumberWithName(LinkedList<Room>bookedRooms, Guest nameToFind){

        for (Room room: bookedRooms) {
            if(room.getRoomGuest()!= null && room.getRoomGuest().getName().equals(nameToFind)){
                System.out.println("found a matching room " + room.getRoomNumber() + " name " + room.getRoomGuest().getName() +
                        " surname " + room.getRoomGuest().getSurname());
                return room.getRoomNumber();
            }
        }
        return -1;

    }


}
