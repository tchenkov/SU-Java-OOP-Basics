package L06_Inheritance_Exercises.P06_Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String animalType;
            if ((animalType = br.readLine()).equals("Beast!")){
                break;
            }
    
            String[] animalInfo = br.readLine().split(" ");
            try {
                if (animalInfo.length != 3){
                    throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT);
                }
                
                String name = animalInfo[0];
                int age = Integer.parseInt(animalInfo[1]);
                String gender = animalInfo[2];
                
                switch (animalType){
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        dog.produceSound();
                        break;
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        cat.produceSound();
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        frog.produceSound();
                        break;
                    case "Kitten":
                        if (!gender.equals(Kitten.GENDER)){
                            throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT);
                        }
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        kitten.produceSound();
                        break;
                    case "Tomcat":
                        if (!gender.equals(Tomcat.GENDER)){
                            throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT);
                        }
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        tomcat.produceSound();
                        break;
                    default:
                        throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT);
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                continue;
            }
            
            
        }
        
        
    }
}
