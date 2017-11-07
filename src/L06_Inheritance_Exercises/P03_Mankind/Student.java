package L06_Inheritance_Exercises.P03_Mankind;

public class Student extends Human{
    private static final int MIN_FACULTY_NUMBER_LENGTH = 5;
    private static final int MAX_FACULTY_NUMBER_LENGTH = 10;
    
    private String facultyNumber;
    
    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }
    
    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < MIN_FACULTY_NUMBER_LENGTH || MAX_FACULTY_NUMBER_LENGTH < facultyNumber.length()){
            throw new IllegalArgumentException(ErrorMessages.INVALID_STUDENT_FACULTY_NUMBER);
        }
        this.facultyNumber = facultyNumber;
    }
    
    private String getFacultyNumber() {
        return facultyNumber;
    }
    
    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        output.append("First Name: ");
        output.append(super.getFirstName());
        output.append(System.lineSeparator());
        output.append("Last Name: ");
        output.append(super.getLastName());
        output.append(System.lineSeparator());
        output.append("Faculty number: ");
        output.append(this.getFacultyNumber());
        
        return output.toString();
    }
}
