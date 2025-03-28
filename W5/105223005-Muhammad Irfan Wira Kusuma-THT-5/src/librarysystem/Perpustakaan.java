package librarysystem;

public class Perpustakaan {
    private Buku[] koleksiBuku = new Buku[10];
    private static int jumlahBuku=0;

    public Perpustakaan(){}

    public void tambahBuku(Buku buku) {
        if(jumlahBuku<koleksiBuku.length){
            koleksiBuku[jumlahBuku++]=buku;
            System.out.println("Buku "+buku.getJudul()+" ditambahkan ke perpustakaan");
        } else {
            System.out.println("Kapasitas perpustakaan penuh");
        }
    }

    public void tampilkanBuku() {
        System.out.println("=== Daftar Buku ===");
        for(int i=0; i<jumlahBuku; i++){
            Buku buku=koleksiBuku[i];
            System.out.print("Judul: "+buku.getJudul()+", Penulis: "+buku.getPenulis()+", Tahun: "+buku.getTahunTerbit()+", Status: "+(buku.isStatusDipinjam() ? "Dipinjam":"Tersedia"));
            if()
        }
    }
}
