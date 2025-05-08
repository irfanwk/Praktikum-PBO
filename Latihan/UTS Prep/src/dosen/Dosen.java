package dosen;

public class Dosen {
    //atribut
    private String nama;
    private String NIDN;

    //konstruktor
    public Dosen(String nama, String NIDN){
        this.nama=nama;
        this.NIDN=NIDN;
    }

    //getter
    public String getNama(){
        return nama;
    }
    public String getNIDN(){
        return NIDN;
    }

}
