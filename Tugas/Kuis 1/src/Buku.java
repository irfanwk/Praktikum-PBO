public class Buku{
    String judul;
    String penulis;
    double harga;

    public Buku(String judul, String penulis, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println(judul + " - " + penulis + " (Rp " + harga + ")");
    }
}