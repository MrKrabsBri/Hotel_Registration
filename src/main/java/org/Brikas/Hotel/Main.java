package org.Brikas.Hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String filename = "HotelRoomsSave.bin";
        //System.out.println("Working Directory: " + System.getProperty("user.dir"));

        Scanner scanner = new Scanner(System.in);

        LinkedList<Room> testrooms = SavingManager.readObjectsFromFile(filename);// TESTING
        GuestManager guestManager = new GuestManager(scanner);

        MenuManager.runMenu(filename,testrooms);

        scanner.close();

    }
}