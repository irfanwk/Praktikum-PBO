public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1=new Mahasiswa("Muhammad Irfan Wira Kusuma", "105223005","Ilmu Komputer", 3.98);

        mhs1.tampilkanInfo();

        if(mhs1.isLulus()){
            System.out.println("Selamat " + mhs1.nama + " lulus");
        }else{
            System.out.println("Maaf " + mhs1.nama + " tidak lulus");
        }
    }
}
