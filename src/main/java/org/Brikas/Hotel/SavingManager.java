package org.Brikas.Hotel;

import java.io.*;
import java.util.LinkedList;

public class SavingManager {

    public static void writeToFile(String filename, Object... objects) {
        try (FileOutputStream fs = new FileOutputStream(filename);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {

            for (Object obj : objects) {
                os.writeObject(obj);
            }
            System.out.println("Objects written to " + filename);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//geras
//    public static LinkedList<Room> readObjectsFromFile(String filename) {
//        LinkedList<Room> readRooms = new LinkedList<>();
//
//        try (FileInputStream fi = new FileInputStream(filename);
//             ObjectInputStream os = new ObjectInputStream(fi)) {
//
//            readRooms = (LinkedList<Room>) os.readObject();
//
//            System.out.println("READ OBJECTS");
//
//            // Process the read objects as needed
//
//            System.out.println("READ OBJECTS ENDS");
//
//            os.close();// ar reikia?
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found: " + filename);
//        }
//
//        catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return readRooms;
//    }

    public static LinkedList<Room> readObjectsFromFile(String filename) {
        LinkedList<Room> readRooms = new LinkedList<>();

        try {
            File file = new File(filename);

            if (!file.exists()) {
                // Create an empty file with an empty linked list
                Room testroom1 = new Room(1,false);
                Room testroom2 = new Room(2,false);
                Room testroom3 = new Room(3,false);
                Room testroom4 = new Room(4,false);
                Room testroom5 = new Room(5,false);
                readRooms.add(testroom1);
                readRooms.add(testroom2);
                readRooms.add(testroom3);
                readRooms.add(testroom4);
                readRooms.add(testroom5);

                writeToFile(filename, readRooms);
                System.out.println("Created empty file: " + filename);
            }

            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream os = new ObjectInputStream(fi);

            readRooms = (LinkedList<Room>) os.readObject();

            System.out.println("READ OBJECTS");

            // Process the read objects as needed

            System.out.println("READ OBJECTS ENDS");

            os.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return readRooms;
    }



}
