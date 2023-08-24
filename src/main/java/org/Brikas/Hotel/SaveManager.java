package org.Brikas.Hotel;

import java.io.*;
import java.util.LinkedList;
import java.io.Serializable;

public class SaveManager {

    private static String filename;
    //private static final String filename = "C:/Users/jb196/OneDrive/Desktop/result/bookedRooms.ser";
            //"data/bookedRooms.ser";
            // "C:/Users/jb196/OneDrive/Desktop/Java projects/Briko_Hotel/data/bookedRooms.ser";


//    public static void saveRooms(LinkedList<Room> savedRooms) {
//
//        createDirectoryIfNotExists(filename);
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
//            outputStream.writeObject(savedRooms);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    //uztenka irasyti LinkedLista su Rooms, ir ant tu rooms running menu,
    //dar reikia irasyti kambario istorija.
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
