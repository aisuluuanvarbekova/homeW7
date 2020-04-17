package com.company;

public class Main {

    public static void main(String[] args) {
	Magic magic = new Magic(400,500, "Магический");
	Medic medic = new Medic(200,50, "Лечение");

     Warrior warrior = new Warrior( 600,400,"Сила");
     Hero[]hero = {magic,medic,warrior};


     for (int i = 0; i <hero.length; i++){
         hero[i].applySuperAbility(hero.toString());
     }

    }
}
