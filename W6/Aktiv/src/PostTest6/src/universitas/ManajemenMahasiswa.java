package W6.PostTest6.src.universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa(){
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
        System.out.println("Data berhasil ditambahkan");
    }

    public void tampilkanSemua(){
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.tampilkanData();
        }
    }

    public void tampilkanIPKTertinggi(){
        Mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (Mahasiswa m : daftarMahasiswa){
            if (m.getIPK()>tertinggi.getIPK()) {
                tertinggi=m;
            }
        }

        System.out.println("Mahasiswa dengan IPK tertinggi:");
        tertinggi.tampilkanData();
    }
}
