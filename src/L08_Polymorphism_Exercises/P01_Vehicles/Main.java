package L08_Polymorphism_Exercises.P01_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Vehicle car = getVehicle(br);
        Vehicle truck = getVehicle(br);
        
        travel(car, truck, br);
    }
    
    private static void travel(Vehicle car, Vehicle truck, BufferedReader br) throws IOException {
        int commandsCount = Integer.parseInt(br.readLine());
    
        for (int i = 0; i < commandsCount; i++) {
            String[] command = br.readLine().split(" ");
            
            if (command[0].equals("Drive")){
            
            }
        }
    }
    
    private static Vehicle getVehicle(BufferedReader br) throws IOException {
        String[] vehicleInfo = br.readLine().split(" ");
        switch (vehicleInfo[0]) {
            case "Car":
                return new Car(
                        Double.parseDouble(vehicleInfo[1]),
                        Double.parseDouble(vehicleInfo[2])
                );
            case "Truck":
                return new Truck(
                        Double.parseDouble(vehicleInfo[1]),
                        Double.parseDouble(vehicleInfo[2])
                );
            default:
                return null;
        }
    }
}
