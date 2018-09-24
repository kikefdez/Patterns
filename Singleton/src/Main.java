import Model.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("#######################################");
        System.out.println("# THIS IS A SINGLETON PATTERN EXAMPLE #");
        System.out.println("#######################################");
        System.out.println();

        Singleton singleton = Singleton.getInstance();
        singleton.setValue(123);
        System.out.println(singleton.getValue());
        singleton.setValue(222);
        System.out.println(singleton.getValue());
    }
}
