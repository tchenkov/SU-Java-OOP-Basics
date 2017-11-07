package L05_Inheritance_Lab.P05_RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> integerRandomArrayList = new RandomArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerRandomArrayList.add(i);
        }
        System.out.println(integerRandomArrayList.toString());
        System.out.println(integerRandomArrayList.getRandomElement());
    
        System.out.println(integerRandomArrayList.toString());
    }
}
