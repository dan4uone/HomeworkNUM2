package com.company;

public class Main {

    public static void main(String[] args) {

        Boss b1 = new Boss();
        b1.setBossDamage(50);
        b1.setBossHealth(200);
        b1.setBossDefenseType("Physic");
        System.out.println(b1.getBossDefenseType() + " " + b1.getBossDamage() + " " + b1.getBossHealth());
        for (int i = 0; i <createHeroes().length ; i++) {
            System.out.println(createHeroes()[i].getHeroHealth()+ " "+createHeroes()[i].getHeroDamage()+" "
            + createHeroes()[i].getHeroType());

        }


    }

    public static Hero[] createHeroes() {
        Hero Tanjiro = new Hero(20, 100, "Thunder");
        Hero Tengen = new Hero(30, 100, "Shinobi");
        Hero Zenitsu = new Hero(25, 100, "Physic");

        Hero[] InfinityTrain = {Tanjiro, Tengen, Zenitsu};
        return InfinityTrain;


    }


}
