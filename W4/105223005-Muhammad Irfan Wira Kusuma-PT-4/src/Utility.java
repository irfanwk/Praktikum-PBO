public class Utility {
    public static double hitungDiskon(double totalBiaya, int lamaSewa) {
        if (lamaSewa > 5) {
            return totalBiaya*0.10;
        }else{
            return 0;
        }
    }

    public static String formatMataUang(double angka) {
        return String.format("Rp"+ angka);
    }
} 