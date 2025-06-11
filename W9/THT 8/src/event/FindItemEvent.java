package event;
import entity.Player;
import event.FindItemEvent;
import item.Item;
import item.HealingPotion;

public class FindItemEvent extends Event {
    public void execute(Player player) {
        Item item = new HealingPotion();
        player.addItem(item);
        System.out.println("Anda menemukan ramuan penyembuh!");
    }
}