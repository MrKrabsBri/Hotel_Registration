package org.Brikas.Hotel;

import java.util.LinkedList;

public class Room {
    private int number;
    public boolean isRoomBooked = false ; // po default kambarys neuzimtas


    public Room(){}                            // gal sito 3 value "LinkedList<Guest>allGuestsWhoVisited" net nereikia.
    public Room(int number, boolean roomStatus, LinkedList<Guest>allGuestsWhoVisited) {// add 3 verte to constructor?
        this.number = number;
        this.isRoomBooked = roomStatus;
        this.allGuestsWhoVisited = allGuestsWhoVisited;
    }

    public boolean isRoomBooked() {
        return isRoomBooked;
    }

    public void setRoomBooked(boolean isRoomBooked) {
        this.isRoomBooked = isRoomBooked;
    }
    public int getRoomNumber(){
        return number;
    }
    public boolean getRoomBooked(){
        return isRoomBooked;
    }



    public Guest roomBookedBy ;



    public LinkedList<Guest>allGuestsWhoVisited ;// list of guests that visited this room



    public void setRoomGuest(Guest roomBookedBy) { // auto setter
        this.roomBookedBy = roomBookedBy;
    }
    public Guest getRoomGuest() {
        return roomBookedBy;
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

    @Override
    public String toString(){
       return "Room " + number;
    }
//    public void occupyRoom(Object a){ // cia klaidos bus
//        isRoomEmpty = false;
//    }
//
//    public void clearRoom(Object a){ // cia klaidos bus
//        isRoomEmpty = true;
//    }



}
