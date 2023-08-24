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
//        //comment
//        e.printStackTrace();
//    }
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
