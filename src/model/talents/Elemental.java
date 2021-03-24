package model.talents;

import model.talents.combat.AttackRange;
import model.talents.combat.CombatType;
import model.talents.combat.TalentType;

public class Elemental implements Talent {

    public CombatType combatType;

    public Elemental(AttackRange ar) {
        this.combatType = new CombatType(ar, TalentType.Elemental);
    }

    @Override
    public CombatType weakAgainst() {
        if (this.combatType.attackRange == AttackRange.LONG) {
            return new CombatType(AttackRange.LONG, TalentType.Physical);
        }
        else {
            return new CombatType(AttackRange.SHORT, TalentType.Telekinetic);
        }
    }

    @Override
    public CombatType strongAgainst() {
        if (this.combatType.attackRange == AttackRange.LONG) {
            return new CombatType(AttackRange.LONG, TalentType.Telekinetic);
        }
        else {
            return new CombatType(AttackRange.SHORT, TalentType.Physical);
        }
    }
}
