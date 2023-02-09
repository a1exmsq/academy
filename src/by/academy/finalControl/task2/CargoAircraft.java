package by.academy.finalControl.task2;

public class CargoAircraft extends Plane{

    private int numberOfParachutes;

    public CargoAircraft(Double maxSpeed, String type, Double loadCapacity, Double fuelTankCapacity, Double fuelConsumption, String serialNumber, String name, int numberOfParachutes) {
        super(maxSpeed, type, loadCapacity, fuelTankCapacity, fuelConsumption, serialNumber, name);
        this.numberOfParachutes = numberOfParachutes;
    }

    public int getNumberOfParachutes() {
        return numberOfParachutes;
    }

    public void setNumberOfParachutes(int numberOfParachutes) {
        this.numberOfParachutes = numberOfParachutes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CargoAircraft{");
        sb.append("numberOfParachutes=").append(numberOfParachutes);
        sb.append(", name='").append(name).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", type='").append(type).append('\'');
        sb.append(", loadCapacity=").append(loadCapacity);
        sb.append(", fuelTankCapacity=").append(fuelTankCapacity);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", rangeOfFlight=").append(rangeOfFlight);
        sb.append('}');
        return sb.toString();
    }
}
