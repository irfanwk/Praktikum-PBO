public class App {
    public static void main(String[] args) throws Exception {
        Pelanggan pelanggan1 = new Pelanggan("P001", "Irfan", "miwk@gmail.com", 100000000);
        Produk produk1 = new Produk("PR001", "Laptop", 10000000, 10);
        Transaksi transaksi1 = new Transaksi("TR001", pelanggan1, produk1, 2);

        //statisik sebelum toup saldo
        pelanggan1.tampilkanInfoPelanggan();
        //statisik seetlah topup saldo
        pelanggan1.toUpSaldo(1000000);
        pelanggan1.tampilkanInfoPelanggan();

        //statisik sebelum membeli
        produk1.tampilkanInfoProduk();
        System.out.println();

        //statisik setelah membeli
        transaksi1.prosesTransaksi();
        System.out.println();

        pelanggan1.tampilkanInfoPelanggan();
        produk1.tampilkanInfoProduk();
    }
}
