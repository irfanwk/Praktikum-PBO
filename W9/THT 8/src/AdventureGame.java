import java.util.Scanner;

import entity.Game;
import entity.UserManager;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();
        boolean running = true;

        while (running) {
            System.out.println("\nSelamat datang di game petualangan!");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Keluar");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                if (userManager.login(username, password)) {
                    Game game = new Game();
                    game.start();
                }
            } else if (choice == 2) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                userManager.register(username, password);
            } else if (choice == 3) {
                System.out.println("Terima kasih telah bermain!");
                running = false;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}