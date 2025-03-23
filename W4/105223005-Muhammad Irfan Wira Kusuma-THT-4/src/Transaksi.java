public class Transaksi {
    String idTransaksi;
    Pelanggan pelanggan;
    Produk produk;
    int jumlahBeli;
    double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli){
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
    }
    public void prosesTransaksi() {
        boolean saldoCuku= false;
        boolean stokCukup = false;
        if(pelanggan.saldo >= produk.harga * jumlahBeli) {
            saldoCuku = true;
        }
        if(produk.stok >= jumlahBeli) {
            stokCukup = true;
        }
        if(saldoCuku && stokCukup) {
            pelanggan.kurangiSaldo(produk.harga * jumlahBeli);
            produk.kurangiStok(jumlahBeli);
            totalHarga = produk.harga * jumlahBeli;
            System.out.println("Transaksi Berhasil");
        } else {
            System.out.println("Transaksi Gagal. Cek saldo anda atau cek stok produk");
        }
    }
}
