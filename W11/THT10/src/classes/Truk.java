package classes;

import abstrak.Kendaraan;
import interpace.DapatDisewa;
import interpace.Muatan;

public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private double kapasitas;

    public Truk(String platNomor, String merk, int tahunProduksi, double kapasitas) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitas = kapasitas;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 300000 * hari; 
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public double kapasitasMuatan() {
        return kapasitas;
    }
}