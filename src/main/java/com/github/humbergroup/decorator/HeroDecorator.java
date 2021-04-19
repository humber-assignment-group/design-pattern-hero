package com.github.humbergroup.decorator;

import com.github.humbergroup.Hero;

public abstract class HeroDecorator implements Role {

    protected Hero hero;

    public HeroDecorator(Hero hero) {
        this.hero = hero;
    }


    public abstract void render();

    @Override
    public void beAttacked(int hp) {
        hero.beAttacked(hp);
    }
}
