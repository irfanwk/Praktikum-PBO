public class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumlahKursi() {
        return jumlahKursi;
    }
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    public String getTujuan() {
        return tujuan;
    }
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double hitungHargaTiket() {
        return 100000;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }
    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.1;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equals("Ekonomi")) {
            return harga;
        } else if (kelasLayanan.equals("Bisnis")) {
            return harga * 1.25;
        } else if (kelasLayanan.equals("VIP")) {
            return harga * 1.5;
        } else {
            return harga;
        }
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.2;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equals("Ekonomi")) {
            return harga;
        } else if (kelasLayanan.equals("Bisnis")) {
            return harga * 1.25;
        } else if (kelasLayanan.equals("VIP")) {
            return harga * 1.5;
        } else {
            return harga;
        }
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.5;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        if (kelasLayanan.equals("Ekonomi")) {
            return harga;
        } else if (kelasLayanan.equals("Bisnis")) {
            return harga * 1.25;
        } else if (kelasLayanan.equals("VIP")) {
            return harga * 1.5;
        } else {
            return harga;
        }
    }
}
