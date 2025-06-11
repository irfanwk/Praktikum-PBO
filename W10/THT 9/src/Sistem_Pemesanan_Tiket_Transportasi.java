public class Sistem_Pemesanan_Tiket_Transportasi {
    public static void main(String[] args) {
        Transportasi[] transportasi = new Transportasi[3];
        transportasi[0] = new Bus("Bus Banjar", 30, "Barabai");
        transportasi[1] = new Kereta("Kereta Banjarnegara", 100, "Tanjung");
        transportasi[2] = new Pesawat("Pesawat Banjarmasin", 155, "Banjarmasin");

        for (Transportasi t : transportasi) {
            System.out.println("Nama: " + t.getNama());
            System.out.println("Jumlah Kursi: " + t.getJumlahKursi());
            System.out.println("Tujuan: " + t.getTujuan());
            System.out.println("Harga Tiket Default: " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                Bus bus = (Bus) t;
                System.out.println("Harga Tiket Bus (Ekonomi): " + bus.hitungHargaTiket("Ekonomi"));
                System.out.println("Harga Tiket Bus (Bisnis): " + bus.hitungHargaTiket("Bisnis"));
                System.out.println("Harga Tiket Bus (VIP): " + bus.hitungHargaTiket("VIP"));
            } else if (t instanceof Kereta) {
                Kereta kereta = (Kereta) t;
                System.out.println("Harga Tiket Kereta (Ekonomi): " + kereta.hitungHargaTiket("Ekonomi"));
                System.out.println("Harga Tiket Kereta (Bisnis): " + kereta.hitungHargaTiket("Bisnis"));
                System.out.println("Harga Tiket Kereta (VIP): " + kereta.hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat) {
                Pesawat pesawat = (Pesawat) t;
                System.out.println("Harga Tiket Pesawat (Ekonomi): " + pesawat.hitungHargaTiket("Ekonomi"));
                System.out.println("Harga Tiket Pesawat (Bisnis): " + pesawat.hitungHargaTiket("Bisnis"));
                System.out.println("Harga Tiket Pesawat (VIP): " + pesawat.hitungHargaTiket("VIP"));
            }
            System.out.println();
        }
    }
}