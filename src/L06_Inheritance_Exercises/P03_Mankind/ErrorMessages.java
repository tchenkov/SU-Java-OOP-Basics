package L06_Inheritance_Exercises.P03_Mankind;

class ErrorMessages {
    static final String INVALID_STUDENT_FACULTY_NUMBER = "Invalid faculty number!";
    
    static String getMissingLeadingCapitalLetterMsg(String input) {
        return String.format("Expected upper case letter!Argument: %s", input);
    }
    
    static String getInvalidLengthMsg(int length, String input, String msgModifier) {
        return String.format("Expected length %s %d symbols!Argument: %s", msgModifier, length, input);
    }
    
    static String getValueMismatchMsg(String valueName){
        return String.format("Expected value mismatch!Argument: %s", valueName);
    }
    
}
