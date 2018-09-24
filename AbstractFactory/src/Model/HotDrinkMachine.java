package Model;

import Drink.DrinkInterfaces;
import Factory.FactoryInterface;
import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {
    private List<Pair<String, FactoryInterface>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception{
        Set<Class<? extends FactoryInterface>> types = new Reflections("Factory").getSubTypesOf(FactoryInterface.class);
        for(Class<? extends FactoryInterface> type : types){
            String factoryName = type.getSimpleName().replace("Factory", "");
            FactoryInterface factoryInterface = type.getConstructor().newInstance();

            namedFactories.add(new Pair<>(factoryName, factoryInterface));
        }
    }

    public DrinkInterfaces makeDrinks() throws Exception{
        System.out.println("Availables drinks: ");
        for(int i=0; i<namedFactories.size(); i++){
            Pair<String, FactoryInterface> item = namedFactories.get(i);
            System.out.println(i + ": " + item.getKey());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String line;
            int index, amount;

            if((line = br.readLine()) != null && (index = Integer.parseInt(line)) >= 0 && index < namedFactories.size()){
                System.out.println("PLEASE, specify amount:");
                line = br.readLine();
                if(line != null && (amount = Integer.parseInt(line)) > 0){
                    return namedFactories.get(index).getValue().prepareDrink(amount);
                }
            }
        }

    }
}
