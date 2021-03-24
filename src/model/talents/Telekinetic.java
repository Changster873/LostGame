package model.talents;

import model.talents.combat.AttackRange;
import model.talents.combat.CombatType;
import model.talents.combat.TalentType;

public class Telekinetic implements Talent {

    public CombatType combatType;

    public Telekinetic(AttackRange ar) {
        this.combatType = new CombatType(ar, TalentType.Telekinetic);
    }

    @Override
    public CombatType weakAgainst() {
        if (this.combatType.attackRange == AttackRange.LONG) {
            return new CombatType(AttackRange.LONG, TalentType.Elemental);
        }
        else {
            return new CombatType(AttackRange.SHORT, TalentType.Physical);
        }
    }

    @Override
    public CombatType strongAgainst() {
        if (this.combatType.attackRange == AttackRange.LONG) {
            return new CombatType(AttackRange.LONG, TalentType.Physical);
        }
        else {
            return new CombatType(AttackRange.SHORT, TalentType.Elemental);
        }
    }
}
