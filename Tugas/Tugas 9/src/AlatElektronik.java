
interface Powerable {
    String sumber_pwr = "baterai"; 
    int pwr_cons = 10;
    int batas_pwr=100;
    void turnOn();
    void turnOff();
    void cek_pwr_status();
}
interface Connectable {
    String tipe_conn = "Wi-Fi";
    int batas_kuat_sinyal = 100; 
    int paket_data=10;
    void connect(); 
    void disconnect(); 
    void checkConnection(); 
}

interface Storable {
    int kapasitas = 16; 
    int maxStorage = 128;
    boolean storagePenuh=false;
    void saveData(int dataSize);
    void deleteData(int dataSize);
    void cekStorage();
}

abstract class ElectronicDevice implements Powerable {
    String merk; 
    String model; 
    boolean menyala; 

    ElectronicDevice(String merk, String model) {
        this.merk = merk;
        this.model = model;
        this.menyala = false;
    }
    public void cek_pwr_status() {
        if (menyala) {
            System.out.println("Power consumption: " + pwr_cons + "%");
        } else {
            System.out.println("Power consumption: 0%");
        }
    }
    abstract void displayInfo();
}

abstract class SmartDevice extends ElectronicDevice implements Connectable {
    String OS;
    int levelBaterai; 
    boolean isCharging; 
    int levelSinyal; 

    SmartDevice(String merk, String model, String OS) {
        super(merk, model);
        this.OS = OS;
        this.levelBaterai = 100;
        this.isCharging = false;
        this.levelSinyal = 0;
    }

    public void checkConnection() {
        System.out.println(merk + " " + model + " terkoneksi via WIFI");
    }
    abstract void updateSoftware();
}

class SmartPhone extends SmartDevice implements Storable {
    boolean hasSIM; 
    int usedStorage; 
    boolean isStorageFull; 

    SmartPhone(String merk, String model, String OS) {
        super(merk, model, OS);
        this.hasSIM = true;
        this.usedStorage = 0; 
        this.isStorageFull = false; 
    }

    public void turnOn() {
        menyala = true;
    }

    public void turnOff() {
        menyala = false;
    }

    public void connect() {
        levelSinyal = 80;
    }

    public void disconnect() {
        levelSinyal = 0;
    }

    public void saveData(int dataSize) {
        usedStorage += dataSize;
    }

    public void deleteData(int dataSize) {
        usedStorage -= dataSize;
    }

    public void cekStorage() {
        System.out.println(usedStorage);
    }
    public void displayInfo() {
        System.out.println("SmartPhone: " + merk + " " + model + ", OS: " + OS);
    }

    public void updateSoftware() {
        System.out.println("Updating software to latest " + OS);
    }
}

class SmartTV extends SmartDevice {
    int screenSize; 
    String resolution; 
    boolean isSmartFeaturesEnabled;

    
    SmartTV(String merk, String model, String OS, int screenSize, String resolution) {
        super(merk, model, OS);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.isSmartFeaturesEnabled = true;
    }

    // Implementasi method dari Powerable
    public void turnOn() {
        menyala = true;
    }

    public void turnOff() {
        menyala = false;
    }

    // Implementasi method dari Connectable
    public void connect() {
        levelSinyal = 90;
    }

    public void disconnect() {
        levelSinyal = 0;
    }

    // Implementasi method dari SmartDevice
    public void displayInfo() {
        System.out.println("SmartTV: " + merk + " " + model);
    }

    public void updateSoftware() {
        System.out.println("Updating software to latest " + OS);
    }
}

// Kelas utama untuk testing
public class AlatElektronik {
    public static void main(String[] args) {
        // Membuat objek SmartPhone
        SmartPhone phone = new SmartPhone("Google", "Pixel 6 Pro", "Android");
        phone.turnOn();
        phone.connect();
        phone.saveData(5);
        phone.cekStorage();
        phone.displayInfo();
        phone.updateSoftware();
        phone.turnOff();

        // Membuat objek SmartTV
        SmartTV tv = new SmartTV("LG", "OLED55", "WebOS", 55, "4K");
        tv.turnOn();
        tv.connect();
        tv.displayInfo();
        tv.updateSoftware();
        tv.turnOff();
    }
}