package MataKuliah;

import Dosen.Dosen;
import Mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class MataKuliah {
    private String namaMatkul;
    private String kodeMK;
    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private Dosen[] pengampu1;


    public MataKuliah(String namaMatkul, String kodeMK){
        this.namaMatkul = namaMatkul;
        this.kodeMK = kodeMK;
        this.pengampu = new ArrayList<>();
        this.daftarMahasiswa = new ArrayList<>();

        this.pengampu1=new Dosen[100];
    }
    public void setPengampu1(Dosen[] dsn){
        this.pengampu1=dsn;
    }

    public String getNamaMatkul(){
        return namaMatkul;
    }
    public String getKodeMK(){
        return kodeMK;
    }
    public ArrayList<Dosen> getPengampu(){
        return pengampu;
    }
    public ArrayList<Mahasiswa> getDaftarMahasiswa(){
        return daftarMahasiswa;
    }

    public void setPengampu(ArrayList<Dosen> pengampu) {
        this.pengampu = pengampu;
    }
    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

}
