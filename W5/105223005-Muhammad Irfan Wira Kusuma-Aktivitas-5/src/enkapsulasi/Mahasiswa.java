package enkapsulasi;

public class Mahasiswa {
    String nama;
    private int umur;
    private String jurusan;

    //method setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    //method getter
    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        if(umur>0){
            this.umur = umur;
        } else {
            System.out.println("Umur harus lebih dari 0");
        }
    }

    public int getUmur() {
        return umur;
    }
}
