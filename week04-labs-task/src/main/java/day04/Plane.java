package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity = 60;
    private List<Passenger> passList = new ArrayList<>();

    public boolean addPassanger(Passenger passanger) {
        if (maxCapacity > passList.size()) {
            passList.add(passanger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int packages = 0;
        for (int i = 0; i < passList.size(); i++) {
            packages += passList.get(i).getPackageCount();
        }
        return packages;
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        Passenger passenger= new Passenger("Béla","PDS-154", 5);
        plane.addPassanger(passenger);
        Passenger passengerTwo= new Passenger("Jóska","DFW-543", 3);
        plane.addPassanger(passengerTwo);
        System.out.println(plane.numberOfPackages());
    }
}
