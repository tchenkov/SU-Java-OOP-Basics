package L06_Inheritance_Exercises.P04_MordorsCrueltyPlan;

class Mood {
    private static final int ANGRY = -5;
    private static final int SAD = 0;
    private static final int HAPPY = 15;
    
    static String get(int happiness) {
        if (happiness > HAPPY){
            return "JavaScript";
        }
        
        if (happiness > SAD){
            return "Happy";
        }
        
        if (happiness >= ANGRY){
            return "Sad";
        }
        
        return "Angry";
    }
}
