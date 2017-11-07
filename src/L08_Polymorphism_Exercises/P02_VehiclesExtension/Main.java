package L08_Polymorphism_Exercises.P02_VehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Vehicle car = getVehicle(br);
        Vehicle truck = getVehicle(br);
        Vehicle bus = getVehicle(br);
        
        travel(car, truck, bus, br);
        
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
    
    private static void travel(Vehicle car, Vehicle truck, Vehicle bus, BufferedReader br) throws IOException {
        int commandsCount = Integer.parseInt(br.readLine());
    
        Vehicle currentVehicle = null;
        for (int i = 0; i < commandsCount; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[1]) {
                case "Car":
                    currentVehicle = car;
                    break;
                case "Truck":
                    currentVehicle = truck;
                    break;
                case "Bus":
                    currentVehicle = bus;
                    break;
            }
            
            double distance = Double.parseDouble(command[2]);
            try {
                switch (command[0]) {
                    case "Drive":
                        currentVehicle.driveWithAC(distance);
                        break;
                    case "DriveEmpty":
                        currentVehicle.driveWithoutAC(distance);
                        break;
                    case "Refuel":
                        double fuel = Double.parseDouble(command[2]);
                        currentVehicle.refuel(fuel);
                }
            }
            catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            } catch (NullPointerException npe){
                System.out.println("npe");
            }
        }
    }
    
    private static Vehicle getVehicle(BufferedReader br) throws IOException {
        String[] vehicleInfo = br.readLine().split(" ");
        switch (vehicleInfo[0]) {
            case "Car":
                return new Car(
                        Double.parseDouble(vehicleInfo[1]),
                        Double.parseDouble(vehicleInfo[2]),
                        Double.parseDouble(vehicleInfo[3])
                );
            case "Truck":
                return new Truck(
                        Double.parseDouble(vehicleInfo[1]),
                        Double.parseDouble(vehicleInfo[2]),
                        Double.parseDouble(vehicleInfo[3])
                );
            case "Bus":
                return new Bus(
                        Double.parseDouble(vehicleInfo[1]),
                        Double.parseDouble(vehicleInfo[2]),
                        Double.parseDouble(vehicleInfo[3])
                );
            default:
                return null;
        }
    }
}
