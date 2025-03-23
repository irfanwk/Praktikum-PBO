public class Pelanggan {
    String idPelanggan;
    String nama;
    String email;
    double saldo;

    public Pelanggan(String idPelanggan, String nama, String email, double saldo){
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }
    public void tampilkanInfoPelanggan(){
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Email Pelanggan : " + email);
        System.out.printf("Saldo Pelanggan : %.0f\n", saldo);
        System.out.println();
    }
    public void toUpSaldo(double jumlah){
        saldo += jumlah;
    }
    public void kurangiSaldo(double jumlah){
        if(saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo Tidak Cukup");
        }
    }
}