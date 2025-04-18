package W6.Aktiv.src;
import W6.Aktivitas.Dosen.Dosen;
import W6.Mahasiswa.Mahasiswa;
import W6.MataKuliah.MataKuliah;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dosen cahya = new Dosen("Cahya", "12345");
        Mahasiswa Tiara = new Mahasiswa("Tiara", "01");
        Mahasiswa Diana = new Mahasiswa("Diana", "02");
        MataKuliah PBO = new MataKuliah("PBO", "ntah");

        ArrayList<Dosen> pengampu = new ArrayList<>();
        pengampu.add(cahya);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(Tiara);
        daftarMahasiswa.add(Diana);

        PBO.setPengampu(pengampu);
        PBO.setDaftarMahasiswa(daftarMahasiswa);
        tampilkan(PBO);
    }
    
    public static void tampilkan(MataKuliah mataKuliah) {
        System.out.println("Mata Kuliah: "+mataKuliah.getNama());
        System.out.println("Kode MK    : "+mataKuliah.getKodeMK());
        System.out.println("Pengampu  :");
        for (Dosen d : mataKuliah.getPengampu()) {
            System.out.println(d.getNama());
        }

        System.out.println("Mahasiswa :");
        for (Mahasiswa m : mataKuliah.getDaftarMahasiswa()) {
            System.out.println(m.getNama());
        }
    }
}
        
