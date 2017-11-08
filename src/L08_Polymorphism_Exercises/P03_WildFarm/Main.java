package L08_Polymorphism_Exercises.P03_WildFarm;

import L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.FelinePk.Cat;
import L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.FelinePk.Tiger;
import L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.Mouse;
import L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.Zebra;
import L08_Polymorphism_Exercises.P03_WildFarm.FoodPk.Meat;
import L08_Polymorphism_Exercises.P03_WildFarm.FoodPk.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new ArrayList<>();
        while (true) {
            String animalInputLine;
            if ((animalInputLine = br.readLine()).equals("End")) {
                break;
            }
            
            String[] animalInfo = animalInputLine.split("\\s+");
            Animal animal = getAnimal(animalInfo);
            String[] foodInfo = br.readLine().split("\\s+");
            Food food = getFood(foodInfo);
            
            animal.makeSound();
            try {
                animal.eat(food);
            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            animals.add(animal);
        }
        
        animals.forEach(System.out::println);
    }
    
    private static Food getFood(String[] foodInfo) {
        switch (foodInfo[0]) {
            case "Meat":
                return new Meat(Integer.parseInt(foodInfo[1]));
            case "Vegetable":
                return new Vegetable(Integer.parseInt(foodInfo[1]));
            default:
                return null;
        }
    }
    
    private static Animal getAnimal(String[] animalInfo) {
        Animal animal = null;
        
        switch (animalInfo[0]) {
            case "Cat":
                return new Cat(animalInfo);
            case "Tiger":
                return new Tiger(animalInfo);
            case "Mouse":
                return new Mouse(animalInfo);
            case "Zebra":
                return new Zebra(animalInfo);
            default:
                return null;
        }
    }
}
