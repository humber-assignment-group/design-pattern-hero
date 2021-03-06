package com.github.humbergroup.factory;

/**
 * HeroName includes all heroes in Game with the predefined hp, defence, attack.
 *
 * @author faris
 */
public enum HeroName {

    Aatrox(1000, 10, 20),

    Anivia(800, 20, 40),

    Blitzcrank(500, 0, 60),

    Zyra(1200, 0, 30);

    private final int hp;

    private final int defence;

    private final int attack;

    HeroName(int hp, int defence, int attack) {
        this.hp = hp;
        this.defence = defence;
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }
}
