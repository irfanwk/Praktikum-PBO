package enkapsulasi;

public class mian {
    public static void main(String[] args) {
        Mahasiswa mhs1= new Mahasiswa();
        System.out.println("Nama : "+mhs1.nama);


        mhs1.setNama("miwk");
        System.out.println("Nama : "+mhs1.getNama());

        mhs1.setUmur(20);
        System.out.println("Umur : "+mhs1.getUmur());
        mhs1.setUmur(-2);
        System.out.println("Umur : "+mhs1.getUmur());
        
        Car mycar=new Car();
        System.out.println("Merk : "+mycar.pemilik);
        System.out.println("jumlahBan : "+mycar.jumlahBan);

    }
}
