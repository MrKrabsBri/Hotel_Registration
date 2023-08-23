package org.Brikas.Hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class RegistrationHistoryManager {

    LinkedList<Guest> listOfAllGuests ;//= new LinkedList<>();

    Room room ;
    private static Scanner scanner;

    public RegistrationHistoryManager(Scanner scanner){
        this.scanner = scanner;
    }
    //Guest guest = new Guest();

//    public RegistrationHistoryManager(LinkedList<Guest> listOfAllGuests, Guest guest) {// constructor
//        this.listOfAllGuests = listOfAllGuests;
//    }

    public static void addToGuestHistory(Room room, Guest guest){//LinkedList<Guest>guests

        //gets a List
        room.addGuestToTheList(guest);
        System.out.println("added "+ guest + " to the list of guests of this room: list now is : " +
                room.getAllGuestsWhoVisited()+ "%%%%%%%%%%%%");
    }


    public static int getNumberIndex(LinkedList<Room>rooms){
        System.out.println("Enter the room (1 - " + rooms.size() + ") number to view it's guest history, and see availability, to exit - press 0 ");

        Scanner scanner = new Scanner(System.in);
        int roomNrToShow = -1;

        while (roomNrToShow < 0 || roomNrToShow > rooms.size()) { // this gets us the index of room correctly
            System.out.print("Enter room number (1 - " + rooms.size()+") : ");
            if (scanner.hasNextInt()) {
                roomNrToShow = scanner.nextInt();
                scanner.nextLine();
                if (roomNrToShow < 0 || roomNrToShow > rooms.size()) {
                    System.out.println("Invalid choice. Please enter a number 1 - " + rooms.size()+".");
                }
//                if (roomNrToShow == 1)
//                    break;
            } else {
                System.out.println("Invalid input. Please enter a valid number 1 - " + rooms.size()+".");
                scanner.nextLine();
            }
        }

        return roomNrToShow-1;
    }


    public static void getRegisteredGuestList (LinkedList<Room>allRooms){
        int index = getNumberIndex(allRooms);

        if (index == -1) {
            System.out.println("returning to menu");
            //RegistrationHistoryManager.getRegisteredGuestList(allRooms);
            MenuManager.runMenu(allRooms);
        }

        //displayInfo() here
        System.out.println("Guest history of room nr. " + allRooms.get(index) );
        System.out.println(allRooms.get(index).getAllGuestsWhoVisited());

        System.out.print(( "This room is now: "));
        if(allRooms.get(index).isRoomBooked){
            System.out.println("Booked");
        }
        else System.out.println("Available");

    }




}
