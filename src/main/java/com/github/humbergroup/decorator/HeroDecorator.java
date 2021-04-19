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

    public void increaseDefence(int defence) {
        hero.increaseDefence(defence);
    }

    public void increaseHp(int hp) {
        hero.increaseHp(hp);
    }

    public void increaseAttack(int attack) {
        hero.increaseAttack(attack);
    }
}
