package L04_Encapsulation_Exercises.P03_AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        
        Chicken chicken;
        
        try {
            chicken = new Chicken(name, age);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
    
        System.out.println(chicken);
    }
}
