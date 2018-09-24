package Drink;

public class Tea implements DrinkInterfaces {
    @Override
    public void consume() {
        System.out.println("mmmm, this " + this.getClass().getSimpleName() + " is delicious....");
    }
}
