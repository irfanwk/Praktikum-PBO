package unchecked;

public class App {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try{
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks di luar batas: " + e.getMessage());
        }

        try{
            int hasil = 10 / 0;
            System.out.println(hasil);
        }catch(ArithmeticException e){
            System.out.println("Pembagian dengan nol: " + e.getMessage());
        }
    }
}
