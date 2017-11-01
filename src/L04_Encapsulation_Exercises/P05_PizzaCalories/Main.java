package L04_Encapsulation_Exercises.P05_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Pizza pizza;
        
        try {
            pizza = getPizza();
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            return;
        }
    
        System.out.println(pizza);
        
    }
    
    private static Pizza getPizza() throws IllegalArgumentException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] pizzaNameAndToppingsCount = br.readLine().split(" ");
        String pizzaName = pizzaNameAndToppingsCount[1];
        int toppingsCount = Integer.parseInt(pizzaNameAndToppingsCount[2]);
    
        Pizza pizza = new Pizza(pizzaName, toppingsCount);
        
        String[] doughInfo = br.readLine().split(" ");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double weight = Double.parseDouble(doughInfo[3]);
    
        Dough dough = new Dough(flourType, bakingTechnique, weight);
        pizza.setDough(dough);
    
        String[] toppingInfo = br.readLine().split(" ");
        while (!toppingInfo[0].equals("END")){
            String toppingName = toppingInfo[1];
            double weightInGrams = Double.parseDouble(toppingInfo[2]);
            Topping topping = new Topping(toppingName, weightInGrams);
            pizza.addTopping(topping);
    
            toppingInfo = br.readLine().split(" ");
        }
        
        return pizza;
    }
}
