package L08_Polymorphism_Exercises.P03_WildFarm;

public class ErrorMessages {
    public static String foodRejected(String animalTypePlural){
        return String.format("%s are not eating that type of food!", animalTypePlural);
    }
}
