package FileManagement;

import Model.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileManager {
    public void saveToFile(Singleton singleton, String fileName) throws Exception {
        try(
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ) {
            out.writeObject(singleton);
            System.out.println("Saved singleton to file");
        }
    }
    public Singleton readFromFile(String fileName) throws Exception{
        try(
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn)
        ) {
            System.out.println("Singleton recovered from file");
            return (Singleton) in.readObject();
        }
    }
}
