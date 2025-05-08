import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        double totalBelanja=input.nextDouble();

        System.out.print("Masukkan jenis membership (Platinum/Gold/Silver/TidakAda): ");
        String membership=input.next();

        input.close();

        boolean adaDiskon=false;
        //hitung diskon total belanjar
        if(totalBelanja>500000){
            totalBelanja*=0.8;
            adaDiskon=true;
        }else if(totalBelanja>=250000){
            totalBelanja*=0.9;
            adaDiskon=true;
        }else{
            //nothing
        }

        //hitung diskon memebership
        if(membership=="Platinum"){
            totalBelanja*=0.95;
            adaDiskon=true;
        }else if(membership=="Gold"){
            totalBelanja*=0.97;
            adaDiskon=true;
        }else if(membership=="Silver"){
            totalBelanja*=0.98;
            adaDiskon=true;
        }else if(membership=="Tidak ada"){
            //nothing todo
        }else{
            System.out.println("Jenis membership tidak valid!");
        }

        String isDiskon=(adaDiskon)?"Kamu mendapat diskon":"Kamu tidak mendapat diskon";
        System.out.println(isDiskon+ ". Total belanja kamu adalah Rp"+totalBelanja);
    }
}
