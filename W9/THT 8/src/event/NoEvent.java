package event;
import entity.Player;
import event.NoEvent;

public class NoEvent extends Event {
    public void execute(Player player) {
        super.execute(player);
    }
}