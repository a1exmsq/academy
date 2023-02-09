package by.academy.finalControl.task2;

public class Airliner extends Plane {

    protected int passengerCapacity;

    public Airliner(Double maxSpeed, String type, Double loadCapacity, Double fuelTankCapacity, Double fuelConsumption, String serialNumber, String name, int passengerCapacity) {
        super(maxSpeed, type, loadCapacity, fuelTankCapacity, fuelConsumption, serialNumber, name);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }


}
