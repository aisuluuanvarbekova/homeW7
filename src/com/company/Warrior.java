package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String typeSuperAbility) {
        super(health, damage, typeSuperAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {

        System.out.println( "Супер Способность Воина "+getTypeSuperAbility()+ " Здоровье Воина"+getHealth()+ "Урон к Боссу от Воина"+getDamage());

    }
}



