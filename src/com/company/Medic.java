package com.company;

public class Medic extends Hero {
    public Medic(int health, int damage, String typeSuperAbility) {
        super(health, damage, typeSuperAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println( "Здоровье Медика"+getHealth()+"Урон к Боссу"+getDamage()+"Супер Способность Медика"+getTypeSuperAbility());

    }
}
