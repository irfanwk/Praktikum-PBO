
import classes.Bus;
import classes.MobilPribadi;
import classes.Truk;

public class Utama {
    public static void main(String[] args) throws Exception {
        MobilPribadi mobil = new MobilPribadi("DA 6804", "Honda", 2024);
        System.out.println("Informasi Mobil Pribadi");
        mobil.tampilkanInfo();
        System.out.println("Biaya Sewa 1 hari: Rp " + mobil.hitungBiayaSewa(1));
        System.out.print("Perlu Supir: ");
        if(mobil.perluSupir()) {
            System.out.println("Ya\n");
        } else {
            System.out.println("Tidak\n");
        }

        Bus bus = new Bus("DA 6805", "Mercedes", 2024);
        System.out.println("Informasi Bus");
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa (1 hari: Rp " + bus.hitungBiayaSewa(1));
        System.out.print("Perlu Supir: ");
        if(bus.perluSupir()) {
            System.out.println("Ya\n");
        } else {
            System.out.println("Tidak\n");
        }

        Truk truk = new Truk("DA 6806", "Hino", 2024, 5000);
        System.out.println("Informasi Truk");
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa (1 hari): Rp " + truk.hitungBiayaSewa(1));
        System.out.print("Perlu Supir: ");
        if(truk.perluSupir()) {
            System.out.println("Ya");
        } else {
            System.out.println("Tidak");
        }
        System.out.println("Kapasitas Muatan: " + truk.kapasitasMuatan() + " kg");
    }
}