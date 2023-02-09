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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airliner{");
        sb.append("passengerCapacity=").append(passengerCapacity);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Airliner airliner = (Airliner) o;

        return passengerCapacity == airliner.passengerCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengerCapacity;
        return result;
    }
}
