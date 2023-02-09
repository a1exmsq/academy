package by.academy.finalControl.task2;

import java.util.ArrayList;
import java.util.List;

public class Airline {

    public String name;
    private Plane[] plane;
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


//    public int getTotalPassengerCapacity(){
//        int totalPassengerCapacity = 0;
//        for (Airliner plane : planesList){
//            totalPassengerCapacity += plane.getPassengerCapacity();
//        }
//        return totalPassengerCapacity;
//    }




}
