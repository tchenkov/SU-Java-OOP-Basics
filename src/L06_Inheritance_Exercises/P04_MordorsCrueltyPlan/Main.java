package L06_Inheritance_Exercises.P04_MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        Wizard gandalf = new Wizard();
        
        List<Food> foods = Arrays.stream(br.readLine().split(" "))
                .map(Food::new)
                .collect(Collectors.toList());
        
        gandalf.eatAll(foods);
    
        System.out.println(gandalf.getHappiness());
        System.out.println(gandalf.getMood());
    }
}
