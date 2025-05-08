package mahasiswa;

public class Mahasiswa {
    //atribut
    private String nama;
    private String NIM;


    /*
    contoh overloaded function pada construktor, di bawah ada dua konstruktor dg nama sama, untuk membedakannya terletak pada pengisian arrayny, konstruktor pertama tidak ada isian ketika dipanggil di main program (misalnya)
    => Mahasiswa mhs1=new Mahasiswa();

    kalo kedua ada prameternya
    => Mahasiswa mhs2=new Mahasiswa("miwk", "345");
    */

    //konst
    public Mahasiswa(){}

    public Mahasiswa(String nama, String NIM){
        this.nama=nama;
        this.NIM=NIM;
    }

    //getter
    public String getNama(){
        return nama;
    }
    public String getNIM(){
        return NIM;
    }
}
