package by.academy.finalControl.task2;

public class Plane extends AirTransport {

    private final String serialNumber;

    protected String name;

    public Plane(Double maxSpeed, String type, Double loadCapacity, Double fuelTankCapacity, Double fuelConsumption, String serialNumber, String name) {
        super(maxSpeed, type, loadCapacity, fuelTankCapacity, fuelConsumption);
        this.serialNumber = serialNumber;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Plane{" + "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }
}
