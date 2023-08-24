package org.Brikas.Hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class RegistrationHistoryManager {
    //private static Scanner scanner;
   // public RegistrationHistoryManager(Scanner scanner){
//        this.scanner = scanner;
//    }

    public static void addToGuestHistory(Room room, Guest guest){ //updates history of a room

        room.addGuestToTheList(guest);
        System.out.println("added "+ guest + " to the list of guests of this room. " );
    }

    public static int getNumberIndex(LinkedList<Room>rooms){ // this gets an index, that is used for guest history view
        System.out.println("Enter the room (1 - " + rooms.size() + ") number to view it's guest history, and see availability, to exit - press 0 ");
        Scanner scanner = new Scanner(System.in);
        int roomNrToShow = -1;

        while (roomNrToShow < 0 || roomNrToShow > rooms.size()) { // gets the index of room, to view its guest history
            System.out.print("Enter room number (1 - " + rooms.size()+") : ");
            if (scanner.hasNextInt()) {
                roomNrToShow = scanner.nextInt();
                scanner.nextLine();
                if (roomNrToShow < 0 || roomNrToShow > rooms.size()) {
                    System.out.println("Invalid choice. Please enter a number 1 - " + rooms.size()+".");
                }

            } else {
                System.out.println("Invalid input. Please enter a valid number 1 - " + rooms.size()+".");
                scanner.nextLine();
            }
        }
        return roomNrToShow-1;
    }

    public static void getRegisteredGuestList (LinkedList<Room>allRooms){//retrieve list of guests of a room
        int index = getNumberIndex(allRooms);

        if (index == -1) {
            System.out.println("returning to menu");
            return;
        }

        System.out.println("Guest history of room nr. "  );
        System.out.println(new String(new char[93]).replace('\0', '-'));
        LinkedList<Guest> guestsWhoVisited = allRooms.get(index).getAllGuestsWhoVisited();

        for (Guest guest : guestsWhoVisited) {
            System.out.format("%-30s%n", guest);
        }

        System.out.println(new String(new char[93]).replace('\0', '-'));
        System.out.print(( "This room is now: "));
        if(allRooms.get(index).isRoomBooked){
            System.out.println("Booked");
        }
        else System.out.println("Available");
        System.out.println(new String(new char[93]).replace('\0', '-'));
    }
}
