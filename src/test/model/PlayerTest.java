package test.model;

import model.Player;
import model.talents.Physical;
import model.talents.combat.AttackRange;
import model.talents.combat.TalentType;
import org.junit.Test;

public class PlayerTest {
    Player player = new Player("Henry", null);

    @Test
    public void creating_player() {
        assert player.name.equals("Henry");
        assert player.level == 1;
        assert player.talent == null;
    }

    @Test
    public void assigning_talent() {
        player.talent = new Physical(AttackRange.LONG);
        // long-range physical is weak against long-range telekinetic
        assert player.talent.weakAgainst().talentType == TalentType.Telekinetic;
    }
}
