package FundamentalsExercise.ObjectsAndClassesExercise.VehicleCatalouge;

public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String colour;
    private int horsepower;

    public Vehicle (String typeOfVehicle, String model, String colour, int horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.colour = colour;
        this.horsepower = horsepower;

    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getHorsepower() {
        return horsepower;
    }
    @Override
    public String toString () {
        String typeVeh = typeOfVehicle.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh + "\n" +
                "Model: " +  model + "\n" +
                "Color: " + colour + "\n" +
                "Horsepower: " + horsepower;
    }
}
