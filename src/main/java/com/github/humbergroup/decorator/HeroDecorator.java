package com.github.humbergroup.decorator;

public abstract class HeroDecorator implements Role {

    protected Role hero;

    public HeroDecorator(Role hero) {
        this.hero = hero;
    }

    public abstract void render();

    @Override
    public void beAttacked(int hp) {
        hero.beAttacked(hp);
    }

    @Override
    public void increaseDefence(int defence) {
        hero.increaseDefence(defence);
    }

    @Override
    public void increaseHp(int hp) {
        hero.increaseHp(hp);
    }

    @Override
    public void increaseAttack(int attack) {
        hero.increaseAttack(attack);
    }
}
