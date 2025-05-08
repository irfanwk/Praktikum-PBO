public class Pelanggan {
    private String nama;
    private String nomorKTP;
    private String nomorHP;

    public Pelanggan(String nama, String nomorKTP, String nomorHP) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorHP = nomorHP;
    }

    public void showInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor KTP: " + nomorKTP);
        System.out.println("Nomor HP: " + nomorHP);
        System.out.println();
    }
} 