package by.academy.finalControl.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Airline {

    public String name;
    private final List<Plane> planesList = new ArrayList<>();

    public Airline(String name) {
        this.name = name;
    }

    public void addPlane(Plane plane){
        planesList.add(plane);
    }

    public double getTotalCapacity(){
        double totalLoadCapacity = 0;
        for (Plane plane : planesList){
            totalLoadCapacity += plane.getLoadCapacity();
        }
        return totalLoadCapacity;
    }

    public Stream<Plane> sortByRange(List<Plane> planeList){
        return planeList.stream().sorted(Comparator.comparingDouble(AirTransport::getRangeOfFlight));
    }

    public List<Plane> getPlanesList() {
        return planesList;
    }



    public void findByFuel(double first, double end){
        int count = 0;
        for (Plane p: planesList){
            if (p.getFuelConsumption() > first && p.getFuelConsumption() < end){
                count++;
                System.out.println("Подходит самолет: " + p.getName() + " c расходом топлива:" + p.getFuelConsumption() + "кг/100км" );
            }
        }
        if (count == 0){
            System.out.println("Нет подходящих самолетов");
        }


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airline airline = (Airline) o;

        if (!Objects.equals(name, airline.name)) return false;
        return planesList != null ? planesList.equals(airline.planesList) : airline.planesList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (planesList != null ? planesList.hashCode() : 0);
        return result;
    }


//        public int getTotalPassengerCapacity(){
//        int totalPassengerCapacity = 0;
//        for (Plane plane : planesList){
//            totalPassengerCapacity += plane.getPassengerCapacity();
//        }
//        return totalPassengerCapacity;
//    }


}
