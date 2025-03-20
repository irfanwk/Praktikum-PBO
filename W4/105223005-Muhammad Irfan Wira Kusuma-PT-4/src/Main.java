
public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Mobil
        Mobil mobil1 = new Mobil("B 1234 CD", "Toyota Avanza", 500000, true);
        Mobil mobil2 = new Mobil("D 5678 EF", "Honda Brio", 400000, true);

        // Menampilkan daftar mobil yang tersedia
        System.out.println("Daftar Mobil Tersedia:");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();

        // Membuat objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Andi", "1234567890123456", "081234567890");

        // Melakukan transaksi penyewaan
        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 6);

        // Menampilkan status mobil setelah transaksi
        System.out.println("Status mobil setelah transaksi:");
        mobil1.tampilkanInfo();
    }
}
