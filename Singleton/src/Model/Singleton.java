package Model;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private int value = 0;

    private Singleton(){ }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
}
