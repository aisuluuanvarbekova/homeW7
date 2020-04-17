package com.company;

public class Magic extends Hero {

    public Magic(int health, int damage, String typeSuperAbility) {
        super(health, damage, typeSuperAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Здоровье Мага" +getHealth()+"Урон к Боссу"+getDamage()+"Супер Способность"+getTypeSuperAbility());
    }
}
