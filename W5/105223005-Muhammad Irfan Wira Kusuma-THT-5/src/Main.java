import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;

public class Main {
    public static void main(String[] args) throws Exception {

        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Java Programming", "John Doe", 2020);
        Buku buku2 = new Buku("Data Structures", "Jane Smith", 2019);
        Buku buku3 = new Buku("Algorithms", "Robert Martin", 2021);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        //sebelum dipinjam
        perpustakaan.tampilkanBuku();

        User user1 = new User("miwk", "S001");
        user1.pinjamBuku(buku1);
        //ketika sedang dipinjam
        perpustakaan.tampilkanBuku();

        //ketika udah dikembalikan
        user1.kembalikanBuku(buku1);
        perpustakaan.tampilkanBuku();
    }
}
