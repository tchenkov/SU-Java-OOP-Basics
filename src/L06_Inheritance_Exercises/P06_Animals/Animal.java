package L06_Inheritance_Exercises.P06_Animals;

public class Animal {
    private static final String GENDER_MALE = "male";
    private static final String GENDER_FEMALE = "female";
    
    private String name;
    private int age;
    private String gender;
    
    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
    
    private void setName(String name) {
        if (name == null || name.trim().length() == 0){
            throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT);
        }
        this.name = name;
    }
    
    private void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT);
        }
        this.age = age;
    }
    
    private void setGender(String gender) {
        if (!gender.equalsIgnoreCase(GENDER_MALE) && !gender.equalsIgnoreCase(GENDER_FEMALE)){
            throw new IllegalArgumentException(ErrorMessages.INVALID_INPUT);
        }
        this.gender = gender;
    }
    
    void produceSound(){
        System.out.println("Not implemented!");
    }
    
    @Override
    public String toString() {
        final StringBuilder output= new StringBuilder();
        output.append(this.getClass().getSimpleName());
        output.append(System.lineSeparator());
        output.append(String.format("%s %d %s", this.name, this.age, this.gender));
        
        return output.toString();
    }
}
