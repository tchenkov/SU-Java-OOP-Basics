package L06_Inheritance_Exercises.P04_MordorsCrueltyPlan;

import java.util.List;

class Wizard {
    private int happiness;
    
    Wizard() {
        this.happiness = 0;
    }
    
    int getHappiness() {
        return happiness;
    }
    
    void eatAll(List<Food> foods){
        for (Food food:foods) {
            this.happiness += food.getHappiness();
        }
    }
    
    String getMood(){
        return Mood.get(this.happiness);
    }
}
