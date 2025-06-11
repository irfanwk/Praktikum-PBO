class Orang{
    Orang(){
        System.out.println("Orang dibuat!");
    }
}

class Dosen extends Orang{
    Dosen(){
        super();
        System.out.println("Dosen dibuat!");
    }
}

public class Soal2_AktivasiConstructorSuperclass {
    public static void main(String[] args) throws Exception {
        Dosen d = new Dosen();
    }
}