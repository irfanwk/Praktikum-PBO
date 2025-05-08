package arrayobject;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] arObj = {
            new Mahasiswa("miwk"),
            new Mahasiswa("miwk2")
        };
        for (Mahasiswa obj : arObj){
            System.out.println(obj.nama);
        }

        Mahasiswa[] arObj2 = new Mahasiswa[2];
        arObj2[0] = new Mahasiswa("miwk3");
        arObj2[1] = new Mahasiswa("miwk4");
        for (Mahasiswa obj : arObj2){
            System.out.println(obj.nama);
        }
    }
}
