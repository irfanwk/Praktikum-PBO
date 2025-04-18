public class Main {
    public static void main(String[] args){
        Mahasiswa[] mhs = new Mahasiswa[5];
        String[] nama = {"miwk", "rakan"};
        int[] nim = {1, 2};
        double[] ipk = {3.5, 3.8};
        boolean[] statusMahasiwa = {true, true};
        mhs[0] = new Mahasiswa();
        mhs[1] = new Mahasiswa(nama, nim, ipk, statusMahasiwa);
        mhs[0].display(5);
        mhs[1].display(2);
    }
}
