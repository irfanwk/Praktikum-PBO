public class Mahasiswa {
    static int jumlahMahasiswa=0;
    private String NIM;

    public Mahasiswa(String NIM) {
        this.NIM = NIM;
        jumlahMahasiswa++;
    }

    static void tampilkanJumlahMhs() {
        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
    }
}
