package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public class Sword extends HeroDecorator{

    public Sword (Hero hero){
        super(hero);
        hero.increaseDefence(2);
        hero.increaseAttack(10);
    }

    @Override
    public void render() {
        hero.render();
    }

    @Override
    public void beAttack(int hp) {
        hero.beAttack(hp);
    }
}
