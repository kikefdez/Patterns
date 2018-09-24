package Factory;

import Drink.DrinkInterfaces;
import Drink.Tea;

public class TeaFactory implements FactoryInterface {
    @Override
    public DrinkInterfaces prepareDrink(int amount) {
        System.out.println("Follow the instructions....");
        System.out.println("\t1.- Put in a tea bag");
        System.out.println("\t2.- Boil water");
        System.out.println("\t3.- Pour " + amount + " ml");
        System.out.println("\t4.- Add lemon");
        System.out.println("\nENJOY");

        return new Tea();
    }
}
