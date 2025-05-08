package matakuliah;

import dosen.Dosen;
import mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class Matakuliah {
    //atribut
    private String namaMatkul;
    private String kodeMK;
    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    //konst
    public Matakuliah(String namaMatkul, String kodeMK){
        this.namaMatkul=namaMatkul;
        this.kodeMK=kodeMK;
        this.pengampu=new ArrayList<>();
        this.daftarMahasiswa=new ArrayList<>();
    }
    //setter
    public void setPengampu(ArrayList<Dosen> pengampu){
        this.pengampu=pengampu;
    }
    public void setDaftarMahasiswa(ArrayList<Mahasiswa> mahasiswa){
        this.daftarMahasiswa=mahasiswa;
    }

    //getter
    public String getNamaMatkul(){
        return namaMatkul;
    }
    public String getKodeMK() {
        return kodeMK;
    }
    public ArrayList<Dosen> getPengampu(){
        return pengampu;
    }
    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }


}
