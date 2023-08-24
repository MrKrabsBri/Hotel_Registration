package org.Brikas.Hotel;

import java.io.*;
import java.util.LinkedList;
import java.io.Serializable;

public class WriteObjects {

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


    public static LinkedList<Room> readObjectsFromFile(String filename) {
        LinkedList<Room> readRooms = new LinkedList<>();

        try (FileInputStream fi = new FileInputStream(filename);
             ObjectInputStream os = new ObjectInputStream(fi)) {

            readRooms = (LinkedList<Room>) os.readObject();

            System.out.println("READ OBJECTS");

            // Process the read objects as needed

            System.out.println("READ OBJECTS ENDS");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return readRooms;
    }



//    Guest testGuest = new Guest("Julius","Brikas");
//
//        try ( FileOutputStream fs = new FileOutputStream("Guests.bin")) {
//        ObjectOutputStream os = new ObjectOutputStream(fs);
//        os.writeObject(testingGuest);
//        os.writeObject(testrooms);
//        os.close();
//    } catch (FileNotFoundException e) {
//        //throw new RuntimeException(e);
//        e.printStackTrace();
//    } catch (IOException e){
//        //comment
//        e.printStackTrace();
//    }

}
