package event;
import java.util.Random;

import entity.Player;
import event.EncounterEnemyEvent;
import item.HealingPotion;

public class EncounterEnemyEvent extends Event {
    public void execute(Player player) {
        System.out.println("Anda bertemu musuh!");
        Random rand = new Random();
        if (rand.nextDouble() < 0.5) {
            System.out.println("Anda menang melawan musuh!");
            player.addItem(new HealingPotion());
        } else {
            System.out.println("Anda kalah melawan musuh!");
            player.changeHealth(-20);
        }
    }
}