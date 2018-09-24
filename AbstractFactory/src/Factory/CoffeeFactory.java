package Factory;

import Drink.Coffee;
import Drink.DrinkInterfaces;

public class CoffeeFactory implements FactoryInterface {
    @Override
    public DrinkInterfaces prepareDrink(int amount) {
        System.out.println("Follow the instructions....");
        System.out.println("\t1.- Grind some beans");
        System.out.println("\t2.- Boil water");
        System.out.println("\t3.- Pour " + amount + " ml");
        System.out.println("\t4.- Add cream and sugar");
        System.out.println("\nENJOY");

        return new Coffee();
    }
}
