package kendaraan.rodaempat.listrik;
import kendaraan.rodaempat.Car;

public class ElectricCar extends Car {
    private int batteryLevel;
    public ElectricCar(String brand, int speed, String fuelType, int batteryLevel) {
        super(brand, speed, fuelType);
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery(){
        System.out.println("Mengisi daya baterai");
        System.out.println("Level baterai : "+batteryLevel);
    }

    public void refuel(){
        System.out.println("Electric car is being charged, not refueled with fuel");
    }
}
