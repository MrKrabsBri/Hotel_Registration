package org.Brikas.Hotel;

import java.util.Scanner;
import java.util.LinkedList;

public class MenuManager {
    static Scanner scanner = new Scanner(System.in);

    public static void runMenu(String filename, LinkedList<Room>rooms) {

        int selection = 0;
        do {
            displayMenu();

            if (scanner.hasNextInt()) {
                selection = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (selection) {
                    case 1: // performs check-in
                        System.out.println("Check-in selected.");
                        GuestManager.checkInGuest(rooms);
                        break;
                    case 2: // performs check-out
                        System.out.println("Check-out selected.");
                        GuestManager.checkOutGuestByName(rooms);
                        break;
                    case 3: // shows list of booked rooms, and guests in them
                        System.out.println("Showing list of booked rooms and their guests");
                        System.out.format("%-30s%-30s%n", "Room number", "Guest Name");
                        System.out.println(new String(new char[93]).replace('\0', '-')); // Adjust length as needed

                        for (Room hotelRoom: rooms) {
                            if(hotelRoom.isRoomBooked){

                                System.out.format("%-30s %-30s%n", hotelRoom,  hotelRoom.getRoomGuest());
                            }
                        }
                        System.out.println(new String(new char[93]).replace('\0', '-')); // Adjust length as needed
                        break;
                    case 4: // gets gets guest history of a room
                        System.out.println("Guest history of room and current status selected");
                        RegistrationHistoryManager.getRegisteredGuestList(rooms);
                        break;
                    case 5: // exiting (must be exited here to save progress)
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid choice.");
                scanner.nextLine();
            }
        } while (selection != 5);
        SavingManager.writeToFile(filename,rooms);
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Check-in guest");
        System.out.println("2. Check-out guest");
        System.out.println("3. Show list of booked rooms");
        System.out.println("4. Show guest history of specified room and get it's status");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}



