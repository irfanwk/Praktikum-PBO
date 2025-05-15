class Relasi {
    String nama;
    Relasi teman;

    public Relasi(String nama) {
        this.nama = nama;
        this.teman = null;
    }


    public void setTeman(Relasi teman) {
        this.teman = teman;
    }
}

public class No3 {
    public static void main(String[] args) {
        Relasi r1 = new Relasi("miwk");
        Relasi r2 = new Relasi("rakan");
        Relasi r3 = new Relasi("indra");

        r1.setTeman(r2);
        r2.setTeman(r3);
        Relasi current = r1;
        while (current != null) {
            System.out.println(current.nama);
            current = current.teman;
        }
    }
}