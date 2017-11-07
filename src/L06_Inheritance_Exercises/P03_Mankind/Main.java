package L06_Inheritance_Exercises.P03_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            Student student = getNewStudent(br);
            Worker worker = getNewWorker(br);
    
            System.out.println(student);
            System.out.println();
            System.out.println(worker);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
    
    private static Worker getNewWorker(BufferedReader br) throws IOException {
        String[] workerInfo = br.readLine().split(" ");
        String firstName = workerInfo[0];
        String lastName = workerInfo[1];
        double salary = Double.parseDouble(workerInfo[2]);
        double workingHours = Double.parseDouble(workerInfo[3]);
        
        return new Worker(firstName, lastName, salary, workingHours);
    }
    
    private static Student getNewStudent(BufferedReader br) throws IOException {
        String[] studentInfo = br.readLine().split(" ");
        String firstName = studentInfo[0];
        String lastName = studentInfo[1];
        String facultyNumber = studentInfo[2];
        
        return new Student(firstName, lastName, facultyNumber);
    }
}
