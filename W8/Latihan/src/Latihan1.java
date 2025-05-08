class Hewan{
    String suara="Suara hewan";
}

class Kucing extends Hewan{
    String suara="Meong";
    void tampilkanSuara(){
        System.out.println("Suara milik kelas Kucing : "+ suara);
        System.out.println("Suara milik kelas Hewan  : "+super.suara);
    }
}

public class Latihan1 {
    public static void main(String[] args) throws Exception {
        Kucing kucing = new Kucing();
        kucing.tampilkanSuara();
    }
}
