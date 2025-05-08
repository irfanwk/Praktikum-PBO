class Produk{
    int harga=10000;
}

class Buku extends Produk{
    int harga=25000;
    void bandingkanHarga(){
        System.out.println("Harga Buku : "+harga);
        System.out.println("Harga Produk : "+super.harga);
    }
}

public class Soal3_IdentifikasiAtribut {
    public static void main(String[] args) {
        Buku b = new Buku();
        b.bandingkanHarga();
    }
}
