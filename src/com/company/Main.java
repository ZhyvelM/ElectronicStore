package com.company;

import com.company.model.Store;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/store.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            store = (Store) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }






        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/store.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(store);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
