package L05_Inheritance_Lab.P06_StackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings = new StackOfStrings();
        
        stackOfStrings.push("asd");
        stackOfStrings.push("asdasd");
        stackOfStrings.push("asaad");
        stackOfStrings.push("as322red");
        stackOfStrings.push("asdrrr");
        stackOfStrings.push("asdwsfhjkk");
        
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.isEmpty());
    }
}
