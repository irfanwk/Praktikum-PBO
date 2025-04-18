public class Main {
    public static void main(String[] args) throws Exception {
        Buku[] koleksi = new Buku[3];
        String[] judul = {"ASD", "PBO", "MetNum"};
        String[] penulis = {"A", "B", "C"};
        double[] harga = {125000, 100000, 90000};

        for(int i=0; i<3; i++){
            koleksi[i] = new Buku(judul[i], penulis[i], harga[i]);
        }

        for(int i=0; i<3; i++){
            koleksi[i].tampilkanInfo();
        }

        double total=0;
        for(int i=0;i<3;i++){
            total+=koleksi[i].harga;
        }
        double mean=total/koleksi.length;

        System.out.println("Total: "+total);
        System.out.println("Rata-rata Harga: "+mean);
    }
}
