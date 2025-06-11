//no 1
abstract class Mahasiswa{
    public abstract void isiBiodata(String nama, int nilai);

    String nama;
    int nilai;
    public void registrasi() {
        System.out.println("Nama : " + nama+" telah melakukan registrasi");
    }
    public void testMasuk() {
        System.out.println("Nilai test anda " + nilai);
    }
}

//no 1
class MahasiswaBaru extends Mahasiswa {
    @Override
    public void isiBiodata(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
        System.out.println("Biodata telah diisi");
    }
}
//no 2
abstract class MahasiswaLama extends Mahasiswa {
    public abstract void semester(int semester);
}
// no 2
class MahasiswaRilLama extends MahasiswaLama {
    @Override
    public void semester(int semester) {
        this.nilai = semester;
    }
    @Override
    public void isiBiodata(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}
//no 3
public class Tugas {
    public static void main(String[] args) throws Exception {
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru();
        mahasiswaBaru.isiBiodata("Ahmaf", 80);
        mahasiswaBaru.registrasi();
        mahasiswaBaru.testMasuk();

        MahasiswaRilLama mahasiswaLama = new MahasiswaRilLama();
        mahasiswaLama.semester( 3);
        mahasiswaLama.registrasi();
        mahasiswaLama.testMasuk();
    }
}