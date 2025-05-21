package entity;
import java.util.ArrayList;
import java.util.List;
import entity.Player;
import item.Item;
import item.HealingPotion;

public class Player {
    private int position = 0;
    private int Y_position = 0;
    private int health = 100;
    private int maxHealth = 100;
    private List<Item> inventory = new ArrayList<>();

    public int getPosition() { return position; }
    public int getY_position() { return Y_position; }
    public int getHealth() { return health; }
    public void moveForward() { position++; }
    public void moveBackward() { position--; }
    public void moveLeft() { Y_position--; }
    public void moveRight() { Y_position++; }

    public boolean checkInventory() {
        return !inventory.isEmpty();
    }
    public void changeHealth(int amount) {
        health = Math.max(0, Math.min(health + amount, maxHealth));
    }
    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("Item ditambahkan ke inventori");
    }
    public void useItem(int index) {
        if (index >= 0 && index < inventory.size()) {
            Item item = inventory.get(index);
            if (item instanceof HealingPotion) {
                changeHealth(30);
                System.out.println("Anda menggunakan ramuan penyembuh, kesehatan bertambah 30.");
            } else {
                System.out.println("Item ini tidak memiliki efek khusus.");
            }
            inventory.remove(index);
        } else {
            System.out.println("Indeks tidak valid");
        }
    }

    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventori kosong.");
        } else {
            System.out.println("Inventori:");
            for (int i = 0; i < inventory.size(); i++) {
                System.out.println((i + 1) + ". " + inventory.get(i).getName());
            }
        }
    }
}