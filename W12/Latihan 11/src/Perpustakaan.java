import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        String[] daftarBuku = {"B001", "B002", "B003"};

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Nama Pengguna: ");
            String nama = scanner.nextLine();
            if(nama.isEmpty()) {
                throw new IllegalArgumentException("Nama tidak boleh kosong");
            }

            System.out.print("ID Buku: ");
            String idBuku = scanner.nextLine();
            boolean bukuTersedia = false;
            for (String buku : daftarBuku) {
                if (buku.equals(idBuku)) {
                    bukuTersedia = true;
                    break;
                }
            }
            if (!bukuTersedia) {
                throw new IllegalArgumentException("ID Buku tidak valid");
            }

            System.out.print("Durasi Peminjaman (dalam hari): ");
            int durasi = scanner.nextInt();
            if (durasi <= 0 || durasi > 14) {
                throw new IllegalArgumentException("Durasi peminjaman harus antara 1 dan 14 hari");
            }
            System.out.println("Buku " + idBuku + " berhasil dipinjam oleh " + nama + " selama " + durasi + " hari.");
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
