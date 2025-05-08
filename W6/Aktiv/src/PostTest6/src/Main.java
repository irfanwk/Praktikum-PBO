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
        } while (pilih != 4);
    }
}
