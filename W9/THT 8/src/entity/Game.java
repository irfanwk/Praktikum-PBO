package entity;
import java.util.Random;
import java.util.Scanner;

import entity.Game;
import event.Event;
import event.FindItemEvent;
import event.EncounterEnemyEvent;
import event.NoEvent;

public class Game {
    private Player player;
    private Random rand = new Random();
    private Scanner scanner = new Scanner(System.in);

    public Game() {
        player = new Player();
    }

    private Event generateRandomEvent() {
        double r = rand.nextDouble();
        if (r < 0.2) return new FindItemEvent();
        else if (r < 0.4) return new EncounterEnemyEvent();
        else return new NoEvent();
    }

    public void start() {
        while (Math.abs(player.getPosition()) < 50 && Math.abs(player.getY_position()) < 50 && player.getHealth() > 0) {
            System.out.println("Posisi X: " + player.getPosition() + ", Posisi Y: " + player.getY_position()+", Health: " + player.getHealth());
            System.out.println("Pilih aksi:\n1. Maju\n2. Mundur\n3. Kiri\n4. Kanan\n5. Gunakan item\n6. Lihat inventori\n7. Keluar");
            int choice = scanner.nextInt();

            if (choice == 1) {
                player.moveForward();
                Event event = generateRandomEvent();
                event.execute(player);
            } else if (choice == 2) {
                player.moveBackward();
                Event event = generateRandomEvent();
                event.execute(player);
            } else if (choice == 3) {
                player.moveLeft();
                Event event = generateRandomEvent();
                event.execute(player);
            } else if (choice == 4) {
                player.moveRight();
                Event event = generateRandomEvent();
                event.execute(player);
            } else if (choice == 5) {
                player.showInventory();
                if (player.checkInventory()) {
                    System.out.print("Pilih nomor item: ");
                    int index = scanner.nextInt() - 1;
                    player.useItem(index);
                }
            } else if (choice == 6) {
                player.showInventory();
            } else if (choice == 7) {
                System.out.println("Keluar dari permainan.");
                return;
            }
        }

        if (Math.abs(player.getPosition()) >= 50 || Math.abs(player.getY_position()) >= 50) {
            System.out.println("Selamat, Anda menang!");
        } else if (player.getHealth() <= 0) {
            System.out.println("Anda kalah, kesehatan habis.");
        }
    }
}