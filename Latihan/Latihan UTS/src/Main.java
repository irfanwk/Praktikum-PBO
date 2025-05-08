import Dosen.Dosen;
import Mahasiswa.Mahasiswa;
import MataKuliah.MataKuliah;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //pengapu
        Dosen cahya = new Dosen("Cahya", "12345");
        Dosen budi = new Dosen("Budi", "12345");
        //mahasiswa
        Mahasiswa Tiara = new Mahasiswa("Tiara", "01", "tes");
        Mahasiswa Diana = new Mahasiswa("Diana", "02", "tes");
        //matakuliah
        MataKuliah PBO = new MataKuliah("PBO", "123");
        MataKuliah Kompar = new MataKuliah("Kompar", "124");
        MataKuliah MetNum = new MataKuliah("MetNum", "125");

        /*
         * Dosen
         */
        Dosen[] dsn=new Dosen[5];
        dsn[0]=cahya;
        dsn[1]=budi;

        dsn[2]=new Dosen("Dosen 3", "12345");
        dsn[3]=new Dosen("Dosen 4", "12345");

        //baut array of object mahasiswa dan langsung di dalamny tanpa perlu size
        Mahasiswa[] mhs={Tiara, Diana};

        

        ArrayList<Dosen> pengampuPBO = new ArrayList<>();
        ArrayList<Dosen> pengampuKompar = new ArrayList<>();
        ArrayList<Dosen> pengampuMetnum = new ArrayList<>();

        pengampuPBO.add(cahya);
        pengampuKompar.add(budi);
        pengampuMetnum.add(budi);

        PBO.setPengampu(pengampuPBO);
        Kompar.setPengampu(pengampuKompar);
        MetNum.setPengampu(pengampuMetnum);


        PBO.setPengampu1(dsn);


        ArrayList<Mahasiswa> daftarMahasiswaPBO = new ArrayList<>();
        ArrayList<Mahasiswa> daftarMahasiswaKompar = new ArrayList<>();
        ArrayList<Mahasiswa> daftarMahasiswaMetnum = new ArrayList<>();

        daftarMahasiswaPBO.add(Tiara);
        daftarMahasiswaPBO.add(Diana);
        daftarMahasiswaKompar.add(Tiara);
        daftarMahasiswaKompar.add(Diana);
        daftarMahasiswaMetnum.add(Tiara);

        PBO.setDaftarMahasiswa(daftarMahasiswaPBO);
        Kompar.setDaftarMahasiswa(daftarMahasiswaKompar);
        MetNum.setDaftarMahasiswa(daftarMahasiswaMetnum);
        
        tampilkan(PBO);
        tampilkan(Kompar);
        tampilkan(MetNum);
    }

    public static void tampilkan(MataKuliah matkul){
        System.out.println("Nama Mata Kuliah : " + matkul.getNamaMatkul());
        System.out.println("Kode Mata Kuliah : " + matkul.getKodeMK());
        System.out.print("Pengampu : ");
        //foreach
        for (Dosen d : matkul.getPengampu()) {
            System.out.print(d.getNama()+", ");
        }

        //for biasa
        for(int i=0; i<matkul.getPengampu().size(); i++){
            System.out.print(matkul.getPengampu().get(i).getNama()+", ");
        }

        System.out.println();
        System.out.print("Mahasiswa : ");
        for (Mahasiswa m : matkul.getDaftarMahasiswa()) {
            System.out.print(m.getNama()+", ");
        }
        System.out.println("\n");
    }
}
