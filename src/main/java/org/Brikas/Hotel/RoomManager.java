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
    private LinkedList<Room> rooms = new LinkedList<>();//delete

    // ar tikrai static, kadangi sukuriamas bookedRooms?
    public static LinkedList<Room> listOfBookedRooms(LinkedList<Room>rooms){ // think about array list
        //sitas metodas neprintins, o bus naudojamas maine, su displayInfo();
        bookedRooms.clear();
        for (Room hotelRoom: rooms) {
              if(hotelRoom.isRoomBooked){ // if booked
                 // System.out.println("Room " + hotelRoom.getRoomNumber() +" - Booked by : "+ hotelRoom.getRoomGuest());
                  bookedRooms.add(hotelRoom);
                 //ALSO SHOW WHO LIVES IN THE ROOMS
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

    //public static void addARoomToTheBookedList(LinkedList<Room>rooms, Room room){
//        rooms.add(room);
//    }

//    public void displayRoomList(LinkedList<Room>bookedRooms ){
//        for (Room room:bookedRooms) {
//            System.out.println("Number : " + room.getRoomNumber() + " ;");
//        }
//    }

    public Room findRoomWithName(LinkedList<Room>bookedRooms, Guest guestToFind){
        for (Room room: bookedRooms) {
                if(room.getRoomGuest()!= null && room.getRoomGuest().getName().equals(guestToFind.getName()) &&
                    room.getRoomGuest().getSurname().equals(guestToFind.getSurname()))
                return room;
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder table = new StringBuilder();
        table.append("+------------+----------------------+---------------------------------------------+\n");
        table.append("| Room Number| Status               | Guest Name           |\n");
        table.append("+------------+----------------------+---------------------------------------------+\n");

        for (Room room : rooms) {
            table.append(room).append('\n');
        }

        table.append("+------------+----------------------+----------------------+\n");
        return table.toString();
    }

}
