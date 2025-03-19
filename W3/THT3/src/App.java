import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int shiftPagi=30000;
        final int shiftSiang=40000;
        final int shiftMalam=50000;
        final int upahLembur=10000;
        final int batasLembur=20;
        final int batasAbsen=10;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlah pekerja: ");
        int jumlahPekerja=input.nextInt();

        int id[]=new int[jumlahPekerja];
        String nama[]=new String[jumlahPekerja];
        String shift[]=new String[jumlahPekerja];
        int jamKerja[]=new int[jumlahPekerja];
        int hariAbsen[]=new int[jumlahPekerja];
        double gaji[]=new double[jumlahPekerja];
        double gajiLembur[]=new double[jumlahPekerja];
        double gajiTotal[]=new double[jumlahPekerja];
        double gajiPotongan[]=new double[jumlahPekerja];

        for(int i=0;i<jumlahPekerja;i++){
            System.out.print("Masukkan ID karyawan: ");
            id[i]=input.nextInt();
            input.nextLine();
            System.out.print("Masukkan nama karyawan: ");
            nama[i]=input.nextLine();
            System.out.print("Masukkan shift karyawan (Pagi/Siang/Malam): ");
            shift[i]=input.next();
            if(shift[i].equals("Pagi") || shift[i].equals("Siang") || shift[i].equals("Malam")){
                System.out.println();
                //do nothing
            }else{
                System.out.println("Shift tidak valid!");
                i--;
                continue;
            }
            System.out.print("Masukkan jumlah jam kerja karyawan: ");
            jamKerja[i]=input.nextInt();
            if(jamKerja[i]<0||(jamKerja[i]-40)>batasLembur){
                System.out.println("Jam kerja tidak valid!");
                i--;
                continue;
            }
            System.out.print("Masukkan jumlah hari absen karyawan: ");
            if(hariAbsen[i]<0||hariAbsen[i]>batasAbsen){
                System.out.println("Hari absen tidak valid!");
                i--;
                continue;
            }
            hariAbsen[i]=input.nextInt();
            System.out.println("");
            gaji[i]=0;
            gajiLembur[i]=0;
            gajiTotal[i]=0;
            gajiPotongan[i]=0;
        }

        for(int i=0;i<jumlahPekerja;i++){
            switch (shift[i]) {
                case "Pagi":
                    gaji[i]=jamKerja[i]*shiftPagi;
                    break;
                case "Siang":
                    gaji[i]=jamKerja[i]*shiftSiang;
                    break;
                case "Malam":
                    gaji[i]=jamKerja[i]*shiftMalam;
                    break;
                default:
                    break;
            }

            if(jamKerja[i]>40){
                gajiLembur[i]=(jamKerja[i]-40)*upahLembur;
            }
            if(jamKerja[i]<30){
                gajiPotongan[i]=gaji[i]*10/100;
            }
            if(hariAbsen[i]>0){
                gajiPotongan[i]+=hariAbsen[i]*100000;
            }
            gajiTotal[i]=gaji[i]+gajiLembur[i]-gajiPotongan[i];
        }

        System.out.println("Laporan gaji karyawan");
        for(int i=0;i<jumlahPekerja;i++){
            System.out.println("ID: "+id[i]);
            System.out.println("Nama: "+nama[i]);
            System.out.println("Shift: "+shift[i]);
            System.out.println("Jam kerja: "+jamKerja[i]);
            System.out.println("Hari absen: "+hariAbsen[i]);
            System.out.println("Gaji upah: "+gaji[i]);
            System.out.println("Gaji lembur: "+gajiLembur[i]);
            System.out.println("Gaji potongan: "+gajiPotongan[i]);
            System.out.println("Gaji total (upah+lembur-potongan): "+gajiTotal[i]);
            System.out.println();
        }
        input.close();
    }
}