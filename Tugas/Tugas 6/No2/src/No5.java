class Mesin {
    public Mesin(){}
    public void nyalakan() {
        System.out.println("Mesin nyala");
    }
}

class Mobil {
    Mesin msn;
    public Mobil(){
        this.msn = new Mesin();
    }
    public void start() {
        msn.nyalakan();
        System.out.println("Mobil nyala");
    }
}

public class No5{
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.start();
    }
}