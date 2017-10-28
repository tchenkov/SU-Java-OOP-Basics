package L02_DefiningClasses_Exercises.P04_CompanyRoster;

import java.util.*;

public class Department {
    private String name;
    private Set<Employee> employees;
    
    public Department(String name, Set<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
    
    public Department(String name) {
        this(name, new HashSet<>());
    }
    
    public String getName() {
        return name;
    }
    
    public Set<Employee> getEmployees() {
        return employees;
    }
    
    public double averageSalary(){
        return employees.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
    }
    
    public void printDepartment(){
        System.out.println(name);
        List<Employee> sortedEmployees = new LinkedList<>(employees);
        sortedEmployees.sort(sortBySalaryDec);
        for (Employee employee : sortedEmployees){
            System.out.println(employee);
        }
    }
    
    private Comparator<Employee> sortBySalaryDec = (o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary());
    
    
}
