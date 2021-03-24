package test.model;

import model.Player;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void creating_player() {
        Player player = new Player("Henry", null);
        assert player.name.equals("Henry");
        assert player.level == 1;
        assert player.talent == null;
    }
}
