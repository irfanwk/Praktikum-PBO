import Folder1.Mahasiswa;
import Folder2.Dosen;

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa("MIWK", "105223005", "ilkom");
        Mahasiswa mhs2 = new Mahasiswa("miwk", "105223005");
        Mahasiswa mhs3 = new Mahasiswa();

        Dosen dsn = new Dosen("Dosen", "12345", "Matkul");
        Dosen dsn2 = new Dosen(mhs);
        Dosen dsn3 = new Dosen();
    }
}
/*
 * DL Senin mingdep
1. buat class dengan 3 konstruktor dalam folder1
2. buat class lain dengan 2 konstruktor dalma folder2
3. buat 3 variabel dalam setiap class bertipe private
4. Buat objek dari setiap konstruktor per class
5. Buat 1 konstruktor di soal 2 yang menerima parameter bertipe objek dari soal 1

note: tulis tangan, ss console hasil running code

*/