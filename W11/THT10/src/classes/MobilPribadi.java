package classes;

import abstrak.Kendaraan;
import interpace.DapatDisewa;

public class MobilPribadi extends Kendaraan implements DapatDisewa {
    public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 200000 * hari;
    }

    @Override
    public boolean perluSupir() {
        return false;
    }
}
