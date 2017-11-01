package L04_Encapsulation_Exercises.P02_ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double length = Double.parseDouble(br.readLine());
        double width = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        
        Box box;
        try {
            box = new Box(length, width, height);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
    
        System.out.println(String.format("Surface Area - %.2f", box.getSurfaceArea()));
        System.out.println(String.format("Lateral Surface Area - %.2f", box.getLateralSurfaceArea()));
        System.out.println(String.format("Volume - %.2f", box.getVolume()));
    }
}
