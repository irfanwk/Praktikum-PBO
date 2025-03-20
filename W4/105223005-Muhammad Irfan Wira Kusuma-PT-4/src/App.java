public class App {
    public static void main(String[] args) throws Exception {
        Mobil mobil1 = new Mobil("B 1234 CD", "Avanza Putih", 500000, true);
        Mobil mobil2 = new Mobil("DA 6805 PAH", "Brio Biru", 400000, true);

        System.out.println("DAFTAR MOBIL TERSEDIA:");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();

        Pelanggan pelanggan1 = new Pelanggan("miwk", "63712345", "0822334455");

        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 6);

        System.out.println("STATUS MOBIL SETELAH TRANSAKSI:");
        mobil1.tampilkanInfo();
    }
}
