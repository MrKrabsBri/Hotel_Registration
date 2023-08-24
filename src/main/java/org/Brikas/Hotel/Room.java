package org.Brikas.Hotel;

import java.io.Serializable;
import java.util.LinkedList;

public class Room implements Serializable {
    private int number;
    public boolean isRoomBooked = false ; // po default kambarys neuzimtas
    public LinkedList<Guest> allGuestsWhoVisited = new LinkedList<>();
    //public LinkedList<Guest>allGuestsWhoVisited ;// list of guests that visited this room


    public Room(){}

    public Room(int number, boolean roomStatus) {
        this.number = number;
        this.isRoomBooked = roomStatus;
        this.allGuestsWhoVisited = allGuestsWhoVisited;
    }
//    public boolean isRoomBooked() {
//        return isRoomBooked;
//    }
    public void setRoomBooked(boolean isRoomBooked) {
        this.isRoomBooked = isRoomBooked;
    }
    public int getRoomNumber(){
        return number;
    }
    public boolean getRoomBooked(){
        return isRoomBooked;
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


//    public void setRoomGuest(Guest guest){
//        //if (roomStatus == false){
//        // ^^^ if statements will not be here, but in room manager
//        roomBookedBy = guest;
//       // else System.out.println("this room is booked, cannot book this room");
//        }



//    public void registerGuest(Guest guest){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the name of a guest you want to register: ");
//        String name = scanner.nextLine();//guest.getName();
//        System.out.println("Enter the surname of a guest you want to register: ");
//        String surname = scanner.nextLine();//guest.getName();
//        scanner.close();
//        guest.setName(name);
//        guest.setSurname(surname);
//        System.out.println("OBJ vardas yra : " + guest.getName() + " " + guest.getSurname());
//        setRoomStatus(true);// Room is set to : Not available.
//    }

    //        for (Room room:rooms) {      ### task 3 Kambariu perziura
//            if (room.isOccupied == false){
//                rooms.get(room.getNumber()).registerGuest(hotelGuest);
//            }
//        }


//    public void occupyRoom(Object a){ // cia klaidos bus
//        isRoomEmpty = false;
//    }
//
//    public void clearRoom(Object a){ // cia klaidos bus
//        isRoomEmpty = true;
//    }



}
