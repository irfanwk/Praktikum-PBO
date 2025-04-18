public class Mahasiswa {
    String[] nama = new String[5];
    int[] nim = new int[5];
    double[] ipk = new double[5];
    boolean[] statusMahasiwa = new boolean[5];

    public Mahasiswa() {
        for (int i = 0; i < 5; i++) {
            nama[i] = "Mahasiswa " + (i + 1);
            nim[i] = i + 1;
            ipk[i] = 4;
            statusMahasiwa[i] = true;
        }
    }

    public Mahasiswa(String[] nama, int[] nim, double[] ipk, boolean[] statusMahasiwa) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.statusMahasiwa = statusMahasiwa;
    }

    public void display(int neff) {
        for (int i = 0; i < neff; i++) {
            System.out.println("Nama: " + nama[i]);
        }
    }
}
