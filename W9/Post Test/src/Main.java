class Vehicle {
    public void startEngine() {
        System.out.println("Mesin Nyala");
    }
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Mobil Nyala");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Motor Nyala");
    }
}

class License {
    String nomorLisensi;
    String batasValid;

    public License(String nomorLisensi) {
        this.nomorLisensi = nomorLisensi;
        this.batasValid = "15-05-2030";
    }
}

class Driver {
    String name;
    Vehicle vehicle;
    License license;

    public Driver(String name, Vehicle vehicle, String nomorLisensi) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License(nomorLisensi);
    }

    public void displayInfo() {
        System.out.println("Nama Pengemudi: " + name);
        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan: Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan: Motor");
        } else {
            System.out.println("Jenis Kendaraan: Tidak Diketahui");
        }
        System.out.print("Status Mesin: ");
        vehicle.startEngine();
        System.out.println("Nomor Lisensi: " + license.nomorLisensi);
        System.out.println("Lisensi Berlaku Sampai: " + license.batasValid);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        Driver driver1 = new Driver("miwk", car, "naon");
        Driver driver2 = new Driver("wira", motorcycle, "ntah");

        driver1.displayInfo();
        driver2.displayInfo();
    }
}
