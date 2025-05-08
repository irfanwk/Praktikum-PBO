public class Mahasiswa {
    //atribut
    private String nama;
    public String nim;
    protected int angkatan;
    boolean isLulus=false;

    //konstruktor
    public Mahasiswa(String nama, String nim, int angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
    }

    public void Belajar(){
        System.out.println(nama + " sedang belajar");
    }

    public void Belajar(String nama){
        System.out.println(this.nama + " sedang belajar");
    }

    static void Makan(){
        System.out.println("Mahasiswa sedang kuliah");
    }

    public String getnama(){
        return this.nama;
    }

    class DalamKelas{
        void test(){
            System.out.println("ini adalah inner class");
        }
    }

    Mahasiswa(){
        this("no name","00101920",2000);
    }

    Mahasiswa(Mahasiswa mhs){
        this.nama = mhs.nama;
        this.nim = mhs.nim;
        this.angkatan = mhs.angkatan;
    }
}
