class PaymentMethod{
    public void processPayment(double amount) {
        System.out.println("Proses pembayaran dari: " + amount);
    }
    public void processPayment(double amount, String currency) {
        System.out.println("Proses pembayaran dari " + amount + " dengan mata uang " + currency);
    }
}

class CreditCardPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("memproses pembayaran dengan credit card dengan jumlah " + amount);
    }
    public void processPayment(double amount, String currency, String cardType) {
        System.out.println("memproses pembayaran dengan credit card dengan jumlah " + amount + " dengan mata uang" + currency + " menggunakan kartu " + cardType);
    }

}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("memproses pembayaran ewallet dengan jumlah " + amount);
    }
    public void processPayment(double amount, String currency, String numberPhone) {
        System.out.println("memproses pembayaran ewallet dengan jumlah " + amount + " dengan mata uang " + currency + " dengan nomor telepon " + numberPhone);
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("memproses transfer dengan jumlah " + amount);
    }
    public void processPayment(double amount, String currency, String noRek) {
        System.out.println("memproses transfer dengan jumlah  " + amount + " dengan mata uang" + currency + " dengan nomor rekening " + noRek);
    }
}

public class ECommerce_Payment{
    public static void main(String[] args) throws Exception {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.processPayment(100.0);
        paymentMethod.processPayment(100.0, "USD");

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(50000.0);
        creditCardPayment.processPayment(50000.0, "IDR", "Visa");

        EWallet eWallet = new EWallet();
        eWallet.processPayment(300.0);
        eWallet.processPayment(300.0, "EUR", "08215419584x");

        BankTransfer bankTransfer = new BankTransfer();
        bankTransfer.processPayment(400.0);
        bankTransfer.processPayment(400.0, "USD", "987654321");
    }
}
