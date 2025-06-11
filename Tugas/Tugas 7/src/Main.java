import kendaraan.rodaempat.listrik.ElectricCar;

public class Main {
    public static void main(String[] args){
        ElectricCar electricCar = new ElectricCar("Tesla", 200, "Listrik", 80);
        electricCar.start();
        electricCar.displayInfo();
        electricCar.displayCarInfo();
        electricCar.chargeBattery();
        electricCar.refuel();
        electricCar.stop();
    }
}
