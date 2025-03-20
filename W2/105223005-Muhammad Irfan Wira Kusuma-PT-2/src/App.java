import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Nomor 1
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama=input.nextLine();
        System.out.print("Masukkan usia : ");
        int usia=input.nextInt();
        System.out.print("Masukkan jumlah uang yang dimiliki : ");
        double jumlahUang=input.nextDouble();
        System.out.print("Masukkan rata-rata pengeluaran harian : ");
        double meanPengeluaranHarian=input.nextDouble();

        //Nomor 2
        double usiaDouble=usia;
        System.out.println("Konversikan usia (int) ke double =  " + usiaDouble);
        System.out.println("Konversikan jumlah uang (double) ke int. =  " + (int)jumlahUang);

        //Nomor 3
        double uang30Hari=(jumlahUang-(meanPengeluaranHarian*30.0));
        System.out.println("Estimasi uang dalam 30 hari = Rp" + uang30Hari);
        double bulanBertahan=jumlahUang/(meanPengeluaranHarian*30.0);
        System.out.println("Estimasi bulan bertahan = " + bulanBertahan);
        if(bulanBertahan<1){
            System.out.println("PERINGATAN (MERAH): Keuangan Anda tidak stabil!");
        }else if(bulanBertahan<=6){
            System.out.println("PERINGATAN (KUNING): Keuangan Anda kurang stabil! tapi bisa bertahan kurang dari 6 bulan.");
        }else{
            System.out.println("(HIJAU) Keuangan Anda dalam kondisi aman.");
        }

        //Nomor 4
        System.out.println("Apakah usia lebih dari 30? "+(usia>30));
        System.out.println("Apakah usia > 30 dan uang > 10 juta? "+((usia>30)&&(jumlahUang>10000000)));
        System.out.println("Apakah usia < 30 dan uang > 5 juta? "+((usia<30)||(jumlahUang>5000000)));

        //Nomor 5
        System.out.print("Masukkan jumlah hutang = ");
        double hutang=input.nextDouble();
        input.close();
        double absHutang=Math.abs(hutang);
        System.out.println("Nilai absolut hutang = "+absHutang);
        int ceilingMean=(int)Math.ceil(meanPengeluaranHarian);
        System.out.println("Pembulatan keatas pengeluaran harian = "+ceilingMean);
        int randomVal=(int)((Math.random()*900001)+100000);
        System.out.println("Bonus tak terduga (Bilangan acak antara Rp100.000 - Rp1.000.000) = "+randomVal);

        //Nomor 6
        System.out.println("");
        System.out.println("===LAPORAN KEUANGAN PRIBADI===");
        System.out.println("Nama: "+nama);
        System.out.println("Usia: "+usia);
        System.out.println("Uang yang dimiliki: Rp"+jumlahUang);
        System.out.println("Pengeluaran harian rata-rata: Rp"+meanPengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: Rp"+uang30Hari);
        System.out.println("Estimasi bulan bertahan: "+bulanBertahan+" bulan");
        System.out.print("Status Keuangan: ");
        if(bulanBertahan<1){
            System.out.println("PERINGATAN (MERAH): Keuangan Anda tidak stabil!");
        }else if(bulanBertahan<=6){
            System.out.println("PERINGATAN (KUNING): Keuangan Anda kurang stabil! tapi bisa bertahan kurang dari 6 bulan.");
        }else{
            System.out.println("(HIJAU) Keuangan Anda dalam kondisi aman.");
        }
        System.out.println("Nilai absolut dari hutang: Rp"+absHutang);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp"+ceilingMean);
        System.out.println("Bonus tak terduga: Rp"+randomVal);
        System.out.println("Total uang yang dimiliki setelah pengeluaran 30 hari dan bonus: Rp"+(uang30Hari+randomVal));

    }
}