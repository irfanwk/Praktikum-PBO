public class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int lamaSewa;
    private double totalBiaya;
    private boolean berhasil;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int lamaSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
        this.prosesSewa();
    }

    private void prosesSewa() {
        if (mobil.isTersedia()) {
            totalBiaya = mobil.getHargaSewaPerHari()*lamaSewa;
            totalBiaya -= Utility.hitungDiskon(totalBiaya,lamaSewa);
            mobil.ubahStatus(false);
            berhasil = true;
            cetakStruk();
        } else {
            berhasil = false;
            System.out.println("Transaksi gagal! Mobil tidak tersedia.");
        }
    }

    private void cetakStruk() {
        System.out.println("STRUK PENYEWAAN MOBIL");
        pelanggan.showInfo();
        System.out.println("Mobil yang disewa:");
        mobil.tampilkanInfo();
        System.out.println("Lama Sewa: "+lamaSewa+" hari");
        System.out.println("Total Biaya: " + Utility.formatMataUang(totalBiaya));
        System.out.print("Status transaksi: ");
        if(berhasil) {
            System.out.println("Berhasil");
        }else{
            System.out.println("Gagal");
        }
        System.out.println();
    }
} 