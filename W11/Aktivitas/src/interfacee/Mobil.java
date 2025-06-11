package interfacee;

public class Mobil extends Pemilik implements Kendaraan, Pabrik {
    Mobil (String nama){
        super(nama);
    }
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan.");
    }
    @Override
    public void matikanMesin() {
        System.out.println("Mesin mobil dimatikan.");
    }

    @Override
    public void produksi() {
        System.out.println("Mobil sedang diproduksi.");
    }
    @Override
    public void pemilikKendaraan(String nama) {
        System.out.println("Pemilik kendaraan adalah " + nama+" dan punya mobil "+this.nama);
    }
}
