import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        ManajemenMahasiswa manajemenMahasiswa = new ManajemenMahasiswa();
        
        int pilih;
        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengna IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            if(pilih == 1){
                input.nextLine();
                System.out.print("Masukkan NIM: ");
                String NIM = input.nextLine();
                System.out.print("Masukkan Nama: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Prodi: ");
                String prodi = input.nextLine();
                System.out.print("Masukkan IPK: ");
                double IPK = input.nextDouble();

                Mahasiswa mhs = new Mahasiswa(NIM, nama, prodi, IPK);
                manajemenMahasiswa.tambahMahasiswa(mhs);
            } else if (pilih == 2) {
                manajemenMahasiswa.tampilkanSemua();
            } else if (pilih == 3) {
                manajemenMahasiswa.tampilkanIPKTertinggi();
            } else if (pilih == 4) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilih != 4);
        input.close();
    }
}
