import Drink.DrinkInterfaces;
import Model.HotDrinkMachine;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("#############################");
        System.out.println("# WELCOME TO OUR DRINK SHOP #");
        System.out.println("############################# \n");

        HotDrinkMachine drinkFactory = new HotDrinkMachine();
        DrinkInterfaces drink = drinkFactory.makeDrinks();
        drink.consume();
    }
}
