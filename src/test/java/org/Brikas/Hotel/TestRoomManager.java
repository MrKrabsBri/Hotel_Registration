package org.Brikas.Hotel;

import org.Brikas.Hotel.Guest;
import org.Brikas.Hotel.GuestManager;
import org.Brikas.Hotel.Room;
import org.Brikas.Hotel.RoomManager;

import java.util.LinkedList;
import java.util.Scanner;


//import static org.Brikas.Hotel.GuestManager.checkInGuest;

public class TestRoomManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuestManager guestManager1 = new GuestManager(scanner);
        //checkInGuest
    }

        public void testRoomManager(){
            Scanner scanner = new Scanner(System.in);
            LinkedList<Room> testListOfRooms = new LinkedList<>();
            Room testRoomCheckIn = RoomManager.findEmptyRoom(testListOfRooms);
            Guest testGuest = new Guest();

            GuestManager guestManager1 = new GuestManager(scanner);
           // guestManager1.
            //System.out.println(checkInGuest(testListOfRooms,RoomManager.findEmptyRoom(rooms),GuestManager.registerGuest()));
            System.out.println("aAAA");
            System.out.println("aAABBBBA");

        }



}
