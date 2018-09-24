package Model;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final Singleton INSTANCE = new Singleton();
    private int value = 0;

    private Singleton(){ }

    public static Singleton getInstance(){
        return INSTANCE;
    }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }

    /******* THIS IS A VERY IMPORTANT METHOD *******/
    protected Object readResolve(){
        return INSTANCE;
    }
}
