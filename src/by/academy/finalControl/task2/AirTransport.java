package by.academy.finalControl.task2;

public class AirTransport {

    protected Double maxSpeed;

    protected String type;
    protected Double loadCapacity;
    protected Double fuelTankCapacity;
    protected Double fuelConsumption;
    protected Double rangeOfFlight;

    public AirTransport(Double maxSpeed, String type, Double loadCapacity, Double fuelTankCapacity, Double fuelConsumption) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.loadCapacity = loadCapacity;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.rangeOfFlight = fuelTankCapacity / fuelConsumption * 100;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(Double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(Double fuelTankCapacity, Double fuelConsumption) {
        this.rangeOfFlight = fuelTankCapacity / fuelConsumption * 100;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirTransport{");
        sb.append("maxSpeed=").append(maxSpeed);
        sb.append(", type='").append(type).append('\'');
        sb.append(", loadCapacity=").append(loadCapacity);
        sb.append(", fuelTankCapacity=").append(fuelTankCapacity);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", rangeOfFlight=").append(rangeOfFlight);
        sb.append('}');
        return sb.toString();
    }

    public AirTransport() {
    }
}
