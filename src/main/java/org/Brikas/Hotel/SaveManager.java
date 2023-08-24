package org.Brikas.Hotel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class SaveManager {

    private static final String FILE_NAME = "data/rooms.ser";

    public static void saveRooms(LinkedList<Room> rooms) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(rooms);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedList<Room> loadRooms() {
        LinkedList<Room> rooms = new LinkedList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            rooms = (LinkedList<Room>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rooms;
    }

}
