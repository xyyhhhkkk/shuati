package hsp;

public class p440 {
    public static void main(String[] args) {

    }
}

interface Vehicles{
    public void work();
}

class horse implements Vehicles{

    @Override
    public void work() {

    }
}

class Boat implements Vehicles{

    @Override
    public void work() {

    }
}

class Person1{
    String name;
    String Vehicles;

    public Person1(String name, String vehicles) {
        this.name = name;
        Vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicles() {
        return Vehicles;
    }

    public void setVehicles(String vehicles) {
        Vehicles = vehicles;
    }
}