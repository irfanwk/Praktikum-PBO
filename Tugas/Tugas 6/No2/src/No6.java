class Departemen {
    String nama;
    public Departemen(String nama) {
        this.nama = nama;
    }
}

class Universitas {
    String nama;
    Departemen dpt;
    public Universitas(String nama, Departemen dpt) {
        this.nama = nama;
        this.dpt = dpt; 
    }
    public void showInfo() {
        System.out.println("Universitas: "+nama+"\n"+"Departemen: "+dpt.nama);
    }
}

public class No6 {
    public static void main(String[] args) {
        Departemen dpt = new Departemen("Pendidikan IT");
        Universitas univ = new Universitas("UPer", dpt);
        univ.showInfo();
    }
}
