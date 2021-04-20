package com.github.humbergroup.factory;

import com.github.humbergroup.Hero;

/**
 * HeroFactory is the only safe way to create the hero.
 *
 * @author faris
 */
public class HeroFactory {

    /**
     * eagle of singleton
     */
    private static final HeroFactory INSTANCE = new HeroFactory();

    private HeroFactory() {
    }

    public static HeroFactory getInstance() {
        return INSTANCE;
    }

    /**
     * create a hero based on HeroName
     *
     * @param heroName heroName
     * @return the hero object
     * @see HeroName
     * @see Hero
     */
    public Hero create(HeroName heroName) {
        return new Hero(heroName.name(), heroName.getHp(), heroName.getDefence(), heroName.getAttack());
    }
}
