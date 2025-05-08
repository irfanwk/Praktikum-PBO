public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    public void tampilkanInfoProduk(){
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.printf("Harga Produk : %.0f\n", harga);
        System.out.println("Stok Produk : " + stok);
    }
    public void kurangiStok(int jumlah){
        if(stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok Tidak Cukup");
        }
    }
}
