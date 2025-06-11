package kendaraan.rodaempat;
import kendaraan.Vehicle;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public void refuel(){
        System.out.println("Mengisi bahan bakar");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tipe Bahan Bakar: " + fuelType);
    }
    public void displayCarInfo(){
        System.out.println("Merk: " + super.getBrand()+ "\nKecepatan: " + speed + "\nTipe Bahan Bakar: " + fuelType);
    }

    
    
}
