//Latihan praktikum berada di directory Latihan.java
//sedangkan file ini adalah coba-coba pada saat praktikum
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int umur=19;
        double ipk=3.98;
        char inisial='m';
        String nama="Muhammad Irfan Wira Kusuma";

        System.out.println("Hello, World!");
        System.out.print("Nama saya "+nama+" dengan umur "+umur+" dan inisial saya "+inisial+". Saya memiliki IPK "+ipk);

        byte nomorByte=-128; //dari -128 sampai 127
        short iniShort=32000;            //-32768 sampai 32767
        long iniLong    =1;
        float iniFloat  =2;
        double iniDouble=3_14f;

        boolean isJavafun=true;
        System.out.print(isJavafun);

        char var1=65;
        System.out.print(var1);

        //KONVERSI TIPE DATA
        //widening byte short int ling float double (tidak kehilangan presisi dan otomatis)
        short widenomorByte=nomorByte;

        //NARROWING
        byte narrowingShort=(byte) iniShort;

        //NUMERIN TO STRING AND RESERVE
        String teks="100";
        int angkaTeks=Integer.parseInt(teks);
        String teksUmur=String.valueOf(umur);
        
        //Operator mat +*-/%
        //op perbandingan sama aj dg C++
        //op logika sama aj dg C++



        //INPUTAN
        // System.out.print("Masukkan nama anda : ");
        // Scanner input=new Scanner(System.in);       //open scanner
        // String name=input.nextLine();   //bca lebih dari satu kata, kalo sati kata aj isinya next()

        // System.out.print("Masukkan umur anda : ");
        // int age=input.nextInt();
        // System.out.println(name);
        // System.out.println(age);
        // input.close();                              //jangan lupa ditutup
        




        //MATH
        System.out.println(Math.abs(-2441));
        System.out.println(Math.random()); //dari 0 - 1
        System.out.println((int)Math.random()*100); //dari 0 - 1
        System.out.println(Math.max(-2441,2345));
    }
}




// public class App {
//     public static void main(String[] args) {
//         Mahasiswa mhs=new Mahasiswa();
//         mhs.nama="budi";
//         System.out.println(mhs.getNama());
//     }
// }
/* TUGAS
 * 1. apa yang dimaksud denga class, atribut, dan object
 * 2. buat 2 buah class (class1 main, class2 lainnya) 
 * 3. buat di kelas lainnya itu method dan atribut
 * TULIS TANGAN, FOTO, FOTO SCREENSHOOT RUNNINGNYA(INI VSC)
 */