class HealthRecord{
    int nomorRekamMedis;
    String tglPembuatan;
    public HealthRecord(int nomorRekamMedis, String tglPembuatan){
        this.nomorRekamMedis = nomorRekamMedis;
        this.tglPembuatan = tglPembuatan;
    }
}

class Owner{
    String nama;
    Animal hewanPeliharaan;
    public Owner(String nama, Animal hewanPeliharaan){
        this.nama = nama;
        this.hewanPeliharaan = hewanPeliharaan;
    }
}

class Animal{
    HealthRecord healthRecord;

    public Animal(int id, String date){
        this.healthRecord = new HealthRecord(id, date);
    }
    void makeSound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    Dog(int id, String date){
        super(id, date);
    }
    void makeSound(){
        System.out.println("Guk-Guk");
    }
}
class Cat extends Animal{
    Cat(int id, String date){
        super(id, date);
    }
    void makeSound(){
        System.out.println("Meooonngg");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog(1, "15-5-2025");
        Cat cat = new Cat(2, "14-52025");

        Owner owner1 = new Owner("Budi", dog);
        Owner owner2 = new Owner("Siti", cat);

        if (owner1.hewanPeliharaan instanceof Dog) {
            System.out.println(owner1.nama + " memiliki anjing");
        } else if (owner1.hewanPeliharaan instanceof Cat) {
            System.out.println(owner1.nama + " memiliki kucing");
        }
        if (owner2.hewanPeliharaan instanceof Dog) {
            System.out.println(owner2.nama + " memiliki anjing");
        } else if (owner2.hewanPeliharaan instanceof Cat) {
            System.out.println(owner2.nama + " memiliki kucing");
        }

        System.out.println();

        System.out.println("Data Pemilik Hewan Peliharaan:");
        System.out.println("Nama: " + owner1.nama);
        owner1.hewanPeliharaan.makeSound();
        if (owner1.hewanPeliharaan instanceof Dog) {
            System.out.println("Jenis Hewan: Anjing");
        } else if (owner1.hewanPeliharaan instanceof Cat) {
            System.out.println("Jenis Hewan: Kucing");
        }
        System.out.println("Nomor Rekam Medis: " + owner1.hewanPeliharaan.healthRecord.nomorRekamMedis);
        System.out.println("Tanggal Pembuatan: " + owner1.hewanPeliharaan.healthRecord.tglPembuatan);

        System.out.println();

        System.out.println("Nama: " + owner2.nama);
        owner2.hewanPeliharaan.makeSound();
        if (owner2.hewanPeliharaan instanceof Dog) {
            System.out.println("Jenis Hewan: Anjing");
        } else if (owner2.hewanPeliharaan instanceof Cat) {
            System.out.println("Jenis Hewan: Kucing");
        }
        System.out.println("Nomor Rekam Medis: " + owner2.hewanPeliharaan.healthRecord.nomorRekamMedis);
        System.out.println("Tanggal Pembuatan: " + owner2.hewanPeliharaan.healthRecord.tglPembuatan);


    }
}
