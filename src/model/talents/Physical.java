package model.talents;

import model.talents.combat.AttackRange;
import model.talents.combat.CombatType;
import model.talents.combat.TalentType;

public class Physical implements Talent {

    public CombatType combatType;

    public Physical(AttackRange ar) {
        this.combatType = new CombatType(ar, TalentType.Physical);
    }

    @Override
    public CombatType weakAgainst() {
        if (this.combatType.attackRange == AttackRange.LONG) {
            return new CombatType(AttackRange.LONG, TalentType.Telekinetic);
        }
        else {
            return new CombatType(AttackRange.SHORT, TalentType.Elemental);
        }
    }

    @Override
    public CombatType strongAgainst() {
        if (this.combatType.attackRange == AttackRange.LONG) {
            return new CombatType(AttackRange.LONG, TalentType.Elemental);
        }
        else {
            return new CombatType(AttackRange.SHORT, TalentType.Telekinetic);
        }
    }
}
