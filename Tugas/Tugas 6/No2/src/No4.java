class Pelanggan{
    String nama;
    public Pelanggan(String nama){
        this.nama = nama;
    }
}

class Produk{
    String nama;
    public Produk(String nama){
        this.nama = nama;
    }
}

class Transaksi{
    Pelanggan pelanggan;
    Produk produk;
    public Transaksi(Pelanggan pelanggan, Produk produk){
        this.pelanggan = pelanggan;
        this.produk = produk;
    }
    public void showTrsansaksi(){
        System.out.println("Pelanggan: " + pelanggan.nama);
        System.out.println("Produk: " + produk.nama);
    }
}

public class No4{
    public static void main(String[] args){
        Pelanggan pelanggan = new Pelanggan("miwk");
        Produk produk = new Produk("Thinkpad X1 Yoga 4th Gen");
        Transaksi transaksi = new Transaksi(pelanggan, produk);
        transaksi.showTrsansaksi();
    }
}