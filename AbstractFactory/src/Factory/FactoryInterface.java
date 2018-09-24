package Factory;

import Drink.DrinkInterfaces;

public interface FactoryInterface {
    DrinkInterfaces prepareDrink(int amount);
}
