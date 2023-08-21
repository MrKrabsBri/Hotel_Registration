package org.Brikas.Hotel;

import java.util.Scanner;

public class Room {
    private int number;// cia gal i String reiktu paversti
    public boolean isOccupied = false ;

    public Room(int number, boolean isRoomEmpty) {
        this.number = number;
        this.isOccupied = isRoomEmpty;
    }

    public int getNumber(){
        return number;
    }

    public boolean getRoomStatus(){
        return isOccupied;
    }

    public void setRoomStatus(boolean isEmpty){
        this.isOccupied = isEmpty;
    }

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
