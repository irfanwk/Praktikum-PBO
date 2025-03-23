package Folder2;

import Folder1.Mahasiswa;

public class Dosen {
    private String nama;
    private String nip;
    private String matkul;

    public Dosen(){
        this.nama = "Nama Dosen";
        this.nip = "NIP";
        this.matkul = "Mata Kuliah yang diampu";
    }

    public Dosen(String nama, String nip, String matkul){
        this.nama = nama;
        this.nip = nip;
        this.matkul = matkul;
    }

    public Dosen(Mahasiswa mhs){
        this.nama = mhs.getNama();
    }
}
