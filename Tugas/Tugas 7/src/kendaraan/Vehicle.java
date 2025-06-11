package kendaraan;

public class Vehicle{
    private String brand;
    protected int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public void start(){
        System.out.println("Mesin dinyalakan");
    }
    public void stop(){
        System.out.println("Mesin dimatikan");
    }
    public void displayInfo(){
        System.out.println("Merk: " + brand+ "\nKecepatan: " + speed);
    }
    public String getBrand(){
        return brand;
    }
}