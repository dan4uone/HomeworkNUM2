package com.company;

public class Hero {
    private int HeroHealth;
    private String HeroType;
    private int HeroDamage;

    public Hero(int HeroDamage, int HeroHealth, String HeroType) {
        this.HeroDamage = HeroDamage;
        this.HeroHealth = HeroHealth;
        this.HeroType = HeroType;

    }

    public Hero(int HeroDamage,int HeroHealth) {
        this.HeroDamage = HeroDamage;
        this.HeroHealth = HeroHealth;
    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public String getHeroType() {
        return HeroType;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

}
