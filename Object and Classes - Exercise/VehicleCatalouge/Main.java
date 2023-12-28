package FundamentalsExercise.ObjectsAndClassesExercise.VehicleCatalouge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!command.equals("End")) {
            String [] commandArray = command.split(" ");
            Vehicle vehicleInfo = new Vehicle(commandArray[0], commandArray[1],
                    commandArray[2], Integer.parseInt(commandArray[3]));
            vehicleList.add(vehicleInfo);

            command = scanner.nextLine();
        }
        String input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {
            String vehicleModel = input;

            for (Vehicle vehicle: vehicleList) {
                if (vehicleModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                }
            }
            input = scanner.nextLine();
        }
        int carHorsepower = 0;
        int carCounter = 0;
        int truckHorsepower = 0;
        int truckCounter = 0;

        for (Vehicle item: vehicleList) {

            if (item.getTypeOfVehicle().equals("car")) {
                carHorsepower += item.getHorsepower();
                carCounter++;
            } else if (item.getTypeOfVehicle().equals("truck")) {
                truckHorsepower += item.getHorsepower();
                truckCounter++;
            }

        }
        double averageCarHorsepower = carHorsepower * 1.0 / carCounter;
        double averageTruckHorsepower = truckHorsepower * 1.0 / truckCounter;
        if (carCounter == 0) {
            averageCarHorsepower = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsepower);
        if (truckCounter == 0) {
            averageTruckHorsepower = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHorsepower);
    }
}
