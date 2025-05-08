public class Mobil {
    private String nomorPlat;
    private String merek;
    private double hargaSewaPerHari;
    private boolean tersedia;

    public Mobil() {
        this("no info", "no info", 0, true);
    }

    // Konstruktor berparameter
    public Mobil(String nomorPlat, String merek, double hargaSewaPerHari, boolean tersedia) {
        this.nomorPlat=nomorPlat;
        this.merek=merek;
        this.hargaSewaPerHari=hargaSewaPerHari;
        this.tersedia=tersedia;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Plat: "+nomorPlat);
        System.out.println("Merek: "+merek);
        System.out.println("Harga Sewa Per Hari: "+Utility.formatMataUang(hargaSewaPerHari));
        System.out.print("Status: ");
        if(!tersedia) {
            System.out.println("Tidak tersedia");
        }else{
            System.out.println(" Tersedia");
        }
        System.out.println();
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void ubahStatus(boolean status) {
        this.tersedia = status;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }
} 