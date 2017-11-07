package L05_Inheritance_Lab.P05_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList{
    Random random = new Random();
    
    public RandomArrayList() {
        super();
    }
    
    public T getRandomElement(){
        int index = random.nextInt(super.size() - 1);
        T element = (T) super.remove(index);
        return element;
    }
}
