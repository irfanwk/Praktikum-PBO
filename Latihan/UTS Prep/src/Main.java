import dosen.Dosen;
import mahasiswa.Mahasiswa;
import matakuliah.Matakuliah;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //pengampu
        Dosen cahya=new Dosen("Cahya", "123");
        Dosen budi=new Dosen("Budi", "234");
        //mahasiswa
        Mahasiswa tiara=new Mahasiswa("Tiara", "987");
        Mahasiswa diana=new Mahasiswa("Diana", "876");

        //contoh array of object
        /* 
        Mahasiswa[] mhs=new Mahasiswa[5];
        mhs[0]=new Mahasiswa("Tiara", "123");
        mhs[1]=new Mahasiswa("Diana", "3221");
        Dosen[] dsn=new Dosen[5];
        dsn[0]=new Mahasiswa("Cahya", "123");
        */


        //matkul
        Matakuliah pbo=new Matakuliah("PBO", "123");
        Matakuliah kompar=new Matakuliah("KomPar", "124");
        Matakuliah metnum=new Matakuliah("MetNum", "125");

        //buat arraylist PBO buat passing data
        ArrayList<Dosen> pengampuPBO=new ArrayList<>();
        ArrayList<Mahasiswa> daftarMahasiswaPBO=new ArrayList<>();
        pengampuPBO.add(cahya);
        daftarMahasiswaPBO.add(diana);
        daftarMahasiswaPBO.add(tiara);
        pbo.setPengampu(pengampuPBO);
        pbo.setDaftarMahasiswa(daftarMahasiswaPBO);



        //buat arraylist kompar buat passing data
        ArrayList<Dosen> pengampuKompar=new ArrayList<>();
        ArrayList<Mahasiswa> daftarMahasiswaKompar=new ArrayList<>();
        pengampuKompar.add(budi);
        daftarMahasiswaKompar.add(diana);
        daftarMahasiswaKompar.add(tiara);
        kompar.setPengampu(pengampuKompar);
        kompar.setDaftarMahasiswa(daftarMahasiswaKompar);

        //buat arraylist metnum buat passing data
        ArrayList<Dosen> pengampuMetnum=new ArrayList<>();
        ArrayList<Mahasiswa> daftarMahasiswaMetnum=new ArrayList<>();
        pengampuMetnum.add(budi);
        daftarMahasiswaMetnum.add(tiara);
        metnum.setPengampu(pengampuMetnum);
        metnum.setDaftarMahasiswa(daftarMahasiswaMetnum);

        //panggil static
        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(metnum);
    }

    //static meth
    public static void tampilkanData(Matakuliah mk){
        System.out.println("Nama matkul: " + mk.getNamaMatkul());
        System.out.println("Kode matkul: "+mk.getKodeMK());
        System.out.print("Pengampu: ");
        //pake for each
        for (Dosen dos : mk.getPengampu()){
            System.out.print(dos.getNama()+", ");
        }
        System.out.println();
        System.out.print("Daftar mahasiswa: ");
        for (Mahasiswa mhs : mk.getDaftarMahasiswa()){
            System.out.print(mhs.getNama()+", ");
        }
        System.out.println("\n");

    }
}
