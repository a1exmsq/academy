package by.academy.finalControl.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline("Aviakompaniya");
            airline.addPlane(new Airliner(999.9, "Пассажирский", 12000.0, 16600.0,305.5,"AER949FT", "Airbus100", 222));
            airline.addPlane(new Airliner(811.0, "Пассажирский", 11230.5, 18600.0,305.5,"AER950FT", "Boeing737", 180));
            airline.addPlane(new Airliner(936.5, "Пассажирский", 11345.0, 17450.0,305.5,"AER951FT", "Boeing747", 232));
            airline.addPlane(new CargoAircraft(685.5, "Транспортный", 76000.0, 35450.0,551.5,"AER001TT", "Boeing C-17", 45));
            airline.addPlane(new CargoAircraft(744.0, "Транспортный", 63100.0, 33300.0,489.0,"AER002TT", "Airbus A400", 42));

            System.out.println("Общая грузподъемность самолетов: " + airline.getTotalCapacity() + "кг.");
    }
}
