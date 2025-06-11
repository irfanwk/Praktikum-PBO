import java.util.ArrayList;

class Dosen{
    String nip;
    ArrayList<Mahasiswa> mahasiswaList;
    public Dosen(String nip){
        this.nip = nip;
        this.mahasiswaList = new ArrayList<Mahasiswa>();
    }
    public void tambahMhs(Mahasiswa mhs){
        this.mahasiswaList.add(mhs);
    }
    public void showMhs(){
        System.out.println("Dosen NIP: " + this.nip);
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println("NIM: " + mhs.nim);
        }
    }
}

class Mahasiswa{
    String nim;
    ArrayList<MataKuliah> mataKuliahList;
    public Mahasiswa(String nim){
        this.nim = nim;
        this.mataKuliahList = new ArrayList<MataKuliah>();
    }
    public void tambahMk(MataKuliah mk){
        this.mataKuliahList.add(mk);
    }
    public void showMk(){
        System.out.println("Mahasiswa NIM: " + this.nim);
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("Kode MK: " + mk.kodeMK);
        }
    }
}

class MataKuliah{
    String kodeMK;
    ArrayList<Mahasiswa> mahasiswaList;
    public MataKuliah(String kodeMK){
        this.kodeMK = kodeMK;
        this.mahasiswaList = new ArrayList<Mahasiswa>();
    }
    public void tambahMhs(Mahasiswa mhs){
        this.mahasiswaList.add(mhs);
    }
    public void showMhs(){
        System.out.println("Mata Kuliah Kode MK: " + this.kodeMK);
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println("NIM: " + mhs.nim);
        }
    }
}

public class No1_2 {
    public static void main(String[] args) throws Exception {
        Dosen dsn1=new Dosen("11");
        Mahasiswa mhs1=new Mahasiswa("21");
        Mahasiswa mhs2=new Mahasiswa("22");
        MataKuliah mk1=new MataKuliah("MK1");
        MataKuliah mk2=new MataKuliah("MK2");
        //one to many
        dsn1.tambahMhs(mhs1);
        dsn1.tambahMhs(mhs2);
        //many to many
        mhs1.tambahMk(mk1);
        mhs1.tambahMk(mk2);
        mk1.tambahMhs(mhs1);
        mk1.tambahMhs(mhs2);

        dsn1.showMhs();
        mhs1.showMk();
        mk1.showMhs();
    }
}
