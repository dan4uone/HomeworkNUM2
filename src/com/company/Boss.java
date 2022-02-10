package com.company;

public class Boss {
private int BossHealth;
private int BossDamage;
private String BossDefenseType;

    public int getBossHealth() {
        return BossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public String getBossDefenseType() {
        return BossDefenseType;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public void setBossDefenseType(String bossDefenseType) {
        BossDefenseType = bossDefenseType;
    }
}
