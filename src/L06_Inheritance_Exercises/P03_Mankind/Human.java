package L06_Inheritance_Exercises.P03_Mankind;

public class Human {
    private static final int FIRST_NAME_MIN_LENGTH = 4;
    static final int LAST_NAME_MIN_LENGTH = 3;
    private static final String INVALID_NAME_MSG_MODIFIER = "at least";
    private static final String FIRST_NAME_STRING = "firstName";
    private static final String LAST_NAME_STRING = "lastName";
    
    private String firstName;
    private String lastName;
    
    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    
    private void setFirstName(String firstName) {
        if (Character.isLowerCase(firstName.charAt(0))) {
            throw new IllegalArgumentException(ErrorMessages.getMissingLeadingCapitalLetterMsg(FIRST_NAME_STRING));
        }
        
        if (firstName.length() < FIRST_NAME_MIN_LENGTH) {
            throw new IllegalArgumentException(
                    ErrorMessages.getInvalidLengthMsg(FIRST_NAME_MIN_LENGTH, FIRST_NAME_STRING, INVALID_NAME_MSG_MODIFIER));
        }
        
        this.firstName = firstName;
    }
    
    protected void setLastName(String lastName) {
        if (Character.isLowerCase(lastName.charAt(0))) {
            throw new IllegalArgumentException(ErrorMessages.getMissingLeadingCapitalLetterMsg(LAST_NAME_STRING));
        }
        
        if (lastName.length() < LAST_NAME_MIN_LENGTH) {
            throw new IllegalArgumentException(
                    ErrorMessages.getInvalidLengthMsg(LAST_NAME_MIN_LENGTH, LAST_NAME_STRING, INVALID_NAME_MSG_MODIFIER));
        }
        
        this.lastName = lastName;
    }
    
    protected String getFirstName() {
        return firstName;
    }
    
    protected String getLastName() {
        return lastName;
    }
}
