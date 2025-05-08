class Kendaraan{
    Kendaraan(){
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan{
    Mobil(){
        super();
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class Latihan2 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
    }
}
