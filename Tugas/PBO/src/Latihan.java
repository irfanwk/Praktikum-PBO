import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama=input.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim=input.next();
        System.out.print("Masukkan usia : ");
        int usia=input.nextInt();
        System.out.print("Masukkan tinggi badan : ");
        double tinggiBadan=input.nextDouble();

        System.out.println("Perkenalkan nama saya "+nama+" dengan NIM "+nim+". Saya berusia "+usia+" tahun dan memiliki tinggi badan "+tinggiBadan+" cm.");
        System.out.println("");
        System.out.println("1. Hasil dari (usia*2) + 10 / 5 - 3 adalah " + ((usia*2)+10/5-3));
        System.out.println("2. Apakah usia lebih dari 18? Jawaban =  " + (usia>18));
        System.out.println("3. Apakah usia lebih dari 18 dan tinggi lebih dari 160? Jawaban = " + ((usia>18)&&(tinggiBadan>160)));
        double usiaDouble=usia;
        System.out.println("4.1. usia (int) dalam bentuk double  =  " + usiaDouble);
        System.out.println("4.2. tinggi (double)  dalam bentuk int =  " + (int)tinggiBadan);
    }
}
