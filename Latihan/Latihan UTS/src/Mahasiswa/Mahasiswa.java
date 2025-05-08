package Mahasiswa;

public class Mahasiswa {
    private String nama;
    private String NIM;

    public Mahasiswa(String nama, String NIM, String tes) {
        this.nama=nama;
        this.NIM=NIM;
    }

    public String getNama(){
        return nama;
    }

    public String getNIM(){
        return NIM;
    }


}
