public class Main {
    public static void main(String[] args){
        System.out.println(Mahasiswa.jumlahMahasiswa);
        Mahasiswa.tampilkanJumlahMhs();

        Mahasiswa m = new Mahasiswa("105223005");

        System.out.println(m.jumlahMahasiswa);
        m.tampilkanJumlahMhs();
    }
}
