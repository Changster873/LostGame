package model.talents;

import model.talents.combat.CombatType;

public interface Talent {
    public CombatType weakAgainst();
    public CombatType strongAgainst();
}
