import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        input.close();

        //menghitung banyak vokal
        int banyakVokal=0;
        for(int i=0;i<kalimat.length();i++){
            char isVokal=kalimat.charAt(i);
            if(isVokal=='a' || isVokal=='i' || isVokal=='u' || isVokal=='e' || isVokal=='o'){
                banyakVokal++;
            }
        }
        System.out.println("Banyak huruf vokal sebanyak : "+banyakVokal);

        //menentukan ganjil genap
        int even=banyakVokal%2;
        switch (even) {
            case 0:
                System.out.println("Jumlah vokal genap.");
                break;
            case 1:
                System.out.println("Jumlah vokal ganjil");
            default:
                break;
        }

        //reverse kalimat disimpn ke array of char
        char[] banyakHuruf=new char[kalimat.length()];
        int j=0;
        for(int i=kalimat.length()-1;i>-1;i--){
            banyakHuruf[j]=kalimat.charAt(i);
            j++;
        }

        //output 
        System.out.println("Hasil string reverse: ");
        for (char c : banyakHuruf) {
            System.out.print(c);
        }

    }
}
