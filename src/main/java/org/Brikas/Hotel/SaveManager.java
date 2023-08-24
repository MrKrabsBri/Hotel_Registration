package org.Brikas.Hotel;

import java.io.*;
import java.util.LinkedList;

public class SaveManager {
    private static String filename;
    public static void saveRooms(LinkedList<?> rooms, String filename) {

        createDirectoryIfNotExists(filename);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(rooms);
            System.out.println("LinkedList saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedList<Room> loadRooms(String loadFileName) {
        LinkedList<Room>loadRooms = new LinkedList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            loadRooms = (LinkedList<Room>) inputStream.readObject();
            System.out.println("Loaded rooms from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return loadRooms;
    }

    private static void createDirectoryIfNotExists(String directoryName) {
        File directory = new File(directoryName);
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory '" + directoryName + "' created.");
            } else {
                System.out.println("Failed to create directory '" + directoryName + "'.");
            }
        }
    }
}
