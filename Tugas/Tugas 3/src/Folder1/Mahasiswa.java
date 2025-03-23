package Folder1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(){
        this.nama = "Nama Mahasiswa";
        this.nim = "NIM";
        this.jurusan = "Jurusan";
    }

    public Mahasiswa(String nama, String nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = "Jurusan";
    }
    public String getNama() {
        return nama;
    }
}
