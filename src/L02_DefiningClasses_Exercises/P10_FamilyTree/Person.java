package L02_DefiningClasses_Exercises.P10_FamilyTree;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private static int personCount = 0;
    private int personId;
    private String firstName;
    private String lastName;
    private String birthday;
    private List<Integer> parentsIds;
    private List<Integer> childrenIds;
    
    
    public Person() {
        this.personId = ++personCount;
        this.parentsIds = new LinkedList<>();
        this.childrenIds = new LinkedList<>();
    }
    
    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = "";
    }
    
    public Person(String birthday) {
        this();
        this.firstName = "";
        this.lastName = "";
        this.birthday = birthday;
    }
    
    public Person(String firstName, String lastName, String birthday) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    
    public int getPersonId() {
        return personId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public List<Integer> getParentsIds() {
        return parentsIds;
    }
    
    public List<Integer> getChildrenIds() {
        return childrenIds;
    }
}
