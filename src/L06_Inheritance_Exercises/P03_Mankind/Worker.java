package L06_Inheritance_Exercises.P03_Mankind;

public class Worker extends Human{
    private static final String INVALID_NAME_MSG_MODIFIER = "more than";
    private static final int MIN_WEEK_SALARY = 10;
    private static final int MIN_DAILY_WORkING_HOURS = 1;
    private static final int MAX_DAILY_WORkING_HOURS = 12;
    private static final int WORkING_DAYS_PER_WEEK = 7;
    private static final String LAST_NAME_STRING = "lastName";
    private static final String WEEK_SALARY_STRING = "weekSalary";
    private static final String WORK_HOURS_PER_DAY_STRING = "workHoursPerDay";
    
    private double weekSalary;
    private double workHoursPerDay;
    
    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }
    
    @Override
    protected void setLastName(String lastName) {
        // if MissingLeadingCapitalLetter??
        if (lastName.length() < super.LAST_NAME_MIN_LENGTH) {
            throw new IllegalArgumentException(
                    ErrorMessages.getInvalidLengthMsg(super.LAST_NAME_MIN_LENGTH, LAST_NAME_STRING, INVALID_NAME_MSG_MODIFIER));
        }
        
        super.setLastName(lastName);
    }
    
    private void setWeekSalary(double weekSalary) {
        if (weekSalary < MIN_WEEK_SALARY){
            throw new IllegalArgumentException(ErrorMessages.getValueMismatchMsg(WEEK_SALARY_STRING));
        }
        
        this.weekSalary = weekSalary;
    }
    
    private void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < MIN_DAILY_WORkING_HOURS || MAX_DAILY_WORkING_HOURS < workHoursPerDay){
            throw new IllegalArgumentException(ErrorMessages.getValueMismatchMsg(WORK_HOURS_PER_DAY_STRING));
        }
        
        this.workHoursPerDay = workHoursPerDay;
    }
    
    private double getMoneyEarnedByHour(){
        return this.weekSalary / WORkING_DAYS_PER_WEEK / this.workHoursPerDay;
    }
    
    private double getWeekSalary() {
        return weekSalary;
    }
    
    private double getWorkHoursPerDay() {
        return workHoursPerDay;
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
        output.append(String.format("Week Salary: %.2f", this.getWeekSalary()));
        output.append(System.lineSeparator());
        output.append(String.format("Hours per day: %.2f", this.getWorkHoursPerDay()));
        output.append(System.lineSeparator());
        output.append(String.format("Salary per hour: %.2f", this.getMoneyEarnedByHour()));
        
        return output.toString();
    }
}
