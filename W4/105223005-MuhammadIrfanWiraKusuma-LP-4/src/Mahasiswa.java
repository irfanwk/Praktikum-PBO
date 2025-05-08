public class Mahasiswa {
    public String nama;
    public String nim;
    public String jurusan;
    public double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("IPK: " + this.ipk);
    }

    boolean isLulus() {
        return this.ipk >= 3;
    }
}
