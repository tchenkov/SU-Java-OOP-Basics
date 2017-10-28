package L02_DefiningClasses_Exercises.P04_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int inputsCount = Integer.parseInt(br.readLine());
        Map<String, Department> departments = new LinkedHashMap<>();
        
        getEmployeesDataByDepartments(inputsCount, departments, br);
    
        Comparator<Department> averageSalary = (o1, o2) -> Double.compare(o2.averageSalary(), o1.averageSalary());
        
        
        Department highestAverageSalary = departments.values()
                .stream()
                .sorted(averageSalary)
                .findFirst()
                .get();
    
        System.out.print("Highest Average Salary: ");
        highestAverageSalary.printDepartment();
    }
    
    private static void getEmployeesDataByDepartments(
            int inputsCount, Map<String, Department> departments, BufferedReader br) throws IOException {
        for (int i = 0; i < inputsCount; i++) {
            String[] employeeData = br.readLine().split(" ");
            
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String departmentName = employeeData[3];
            Department department = departments.putIfAbsent(departmentName, new Department(departmentName));
            
            if (employeeData.length == 6){
                String email = employeeData[4];
                int age = Integer.parseInt(employeeData[5]);
                departments.get(departmentName).getEmployees().add(
                        new Employee(name, salary, position, department, email, age)
                );
                continue;
            }
            
            if (employeeData.length == 5 && employeeData[4].contains("@")){
                String email = employeeData[4];
                departments.get(departmentName).getEmployees().add(
                        new Employee(name, salary, position, department, email)
                );
                continue;
            }
            
            if (employeeData.length == 5){
                int age = Integer.parseInt(employeeData[4]);
                departments.get(departmentName).getEmployees().add(
                        new Employee(name, salary, position, department, age)
                );
                continue;
            }
    
            departments.get(departmentName).getEmployees().add(
                    new Employee(name, salary, position, department)
            );
        }
    }
}
