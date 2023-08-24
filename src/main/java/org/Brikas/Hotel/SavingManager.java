package org.Brikas.Hotel;

import java.io.*;
import java.util.LinkedList;

public class SavingManager {

    // writes list of rooms to savefile
    public static void writeToFile(String filename, Object... objects) {
        try (FileOutputStream fs = new FileOutputStream(filename);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {

            for (Object obj : objects) {
                os.writeObject(obj);
            }
            System.out.println("Hotel room data was written to " + filename);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //reads a list of rooms from savefile, if it doesn't exists, new list is created
    public static LinkedList<Room> readObjectsFromFile(String filename) {
        LinkedList<Room> readRooms = new LinkedList<>();

        try {
            File file = new File(filename);

            if (!file.exists()) {
                // If there is no save file yet, create a LinkedList(Hotel) with empty rooms
                Room newroom1 = new Room(1,false);
                Room newroom2 = new Room(2,false);
                Room newroom3 = new Room(3,false);
                Room newroom4 = new Room(4,false);
                Room newroom5 = new Room(5,false);
                readRooms.add(newroom1);
                readRooms.add(newroom2);
                readRooms.add(newroom3);
                readRooms.add(newroom4);
                readRooms.add(newroom5);

                writeToFile(filename, readRooms);
                System.out.println("Created empty file: " + filename);
            }

            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream os = new ObjectInputStream(fi);

            readRooms = (LinkedList<Room>) os.readObject();
            os.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return readRooms;
    }
}
