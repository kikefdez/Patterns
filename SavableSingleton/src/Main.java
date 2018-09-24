import FileManagement.FileManager;
import Model.Singleton;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("###############################################");
        System.out.println("# THIS IS A SAVABLE SINGLETON PATTERN EXAMPLE #");
        System.out.println("###############################################");
        System.out.println();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.setValue(123);
        System.out.println(singleton1.getValue());

        String fileName = "singleton.bin";
        FileManager fileManager = new FileManager();
        fileManager.saveToFile(singleton1, fileName);

        Singleton singleton2 = fileManager.readFromFile(fileName);

        singleton2.setValue(222);
        System.out.println("singleton1: " + singleton1.getValue());
        System.out.println("singleton2: " + singleton2.getValue());
    }
}
