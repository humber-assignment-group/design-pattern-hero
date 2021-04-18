package com.github.humbergroup;

public class HeroFactory {

    private static final HeroFactory INSTANCE = new HeroFactory();

    private HeroFactory() {
    }

    public static HeroFactory getInstance() {
        return INSTANCE;
    }

    public Hero create(HeroName heroName) {
        return new Hero(heroName.name(), heroName.getHp(), heroName.getDefence(), heroName.getAttack());
    }
}
