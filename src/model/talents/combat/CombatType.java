package model.talents.combat;

public class CombatType {

    public AttackRange attackRange;
    public TalentType talentType;

    public CombatType(AttackRange ar, TalentType tt) {
        this.attackRange = ar;
        this.talentType = tt;
    }
}
