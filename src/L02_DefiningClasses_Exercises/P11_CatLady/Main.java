package L02_DefiningClasses_Exercises.P11_CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        Map<String, BaseCat> cats = new HashMap<>();
        String input = br.readLine();
        
        while (!input.equals("End")) {
            String[] catInfo = input.split(" ");
            String catType = catInfo[0];
            String name = catInfo[1];
            
            BaseCat cat = null;
            switch (catType) {
                case "Siamese":
                    double earSize = Double.parseDouble(catInfo[2]);
                    cat = new Siamese(name, earSize);
                    break;
                case "Cymric":
                    double furLength = Double.parseDouble(catInfo[2]);
                    cat = new Cymric(name, furLength);
                    break;
                case "StreetExtraordinaire":
                    double decibelsOfMeows = Double.parseDouble(catInfo[2]);
                    cat = new StreetExtraordinaire(name, decibelsOfMeows);
            }
            cats.putIfAbsent(name, cat);
            
            input = br.readLine();
        }
        
        String catName = br.readLine();
    
        System.out.println(cats.get(catName));
    }
}
