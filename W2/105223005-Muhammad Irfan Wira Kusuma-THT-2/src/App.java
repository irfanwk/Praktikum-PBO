import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama=input.nextLine();
        System.out.print("Masukkan NIM : ");
        String NIM=input.next();
        System.out.print("Masukkan usia : ");
        int usia=input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah yang diambil : ");
        int jumlahMatkul=input.nextInt();

        double IPK=0;
        for(int i=0;i<jumlahMatkul;i++){
            System.out.print("Masukkan nilai mata kuliah ke-"+(i+1)+"(skala 4) : ");
            double IPmatkul=input.nextDouble();
            IPK+=IPmatkul;
        }
        input.close();
        IPK/=jumlahMatkul;

        System.out.println("Apakah mahasiswa berusia lebih dari 22 tahun : "+(usia>22));
        System.out.println("Apakah IPK mahasiswa lebih dari atau sama dengan 3.5 DAN jumlah mata kuliah lebih dari 4 : "+(IPK>=3.5 && jumlahMatkul>4));
        System.out.println("Menentukan apakah IPK mahasiswa kurang dari 2.5 ATAU jumlah mata kuliah kurang dari 4 : "+(IPK<2.5 || jumlahMatkul<4));
        int antrian=(int)((Math.random()*100)+1);

        System.out.println("");
        System.out.println("LAPORAN AKADEMIK MAHASISWA");
        System.out.println("Nomor antrian : "+antrian);
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+NIM);
        System.out.println("Usia : "+usia);
        System.out.println("IPK : "+IPK);
        System.out.println("Jumlah Mata Kuliah : "+jumlahMatkul);
    }
}
