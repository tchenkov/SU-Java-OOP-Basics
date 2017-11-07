package L05_Inheritance_Lab.P06_StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;
    
    public StackOfStrings() {
        this.data = new ArrayList<>();
    }
    
    public void push(String element){
        this.data.add(element);
    }
    
    public String pop(){
        return this.data.remove(this.data.size() - 1);
    }
    
    public String peek(){
        return this.data.get(this.data.size() - 1);
    }
    
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
