class Bangunan{
    String nama="Bangunan Umum";
}

class GedungSekolah extends Bangunan{
    String nama="Gedung Sekolah ABC";
    void tampilkaninfo(){
        System.out.println("Nama : "+nama);
        System.out.println("Nama : "+super.nama);
    }
}

public class Soal1_DetektifAtribut {
    public static void main(String[] args) throws Exception {
        GedungSekolah gs = new GedungSekolah();
        gs.tampilkaninfo();
    }
}
