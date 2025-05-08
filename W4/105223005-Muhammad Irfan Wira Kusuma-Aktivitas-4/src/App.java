public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1=new Mahasiswa("Budi", "123456", 2020);
        Mahasiswa mhs2=new Mahasiswa("Andi", "123457", 2020);

        System.out.println(mhs1.getnama());

        System.out.println(mhs2.getnama());

        mhs1.Belajar();
        mhs2.Belajar("Budi");
        
        Mahasiswa mhs3=new Mahasiswa(mhs1);

        System.out.println(mhs3.getnama());

    }
}
