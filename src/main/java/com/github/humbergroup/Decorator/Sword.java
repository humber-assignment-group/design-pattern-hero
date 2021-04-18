package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public class Sword extends HeroDecorator{

    public Sword (Hero hero){
        super(hero);
        hero.increaseDefence(2);
        hero.increaseAttack(10);
    }

    public void render() {

    }

    @Override
    public void beAttack(int hp) {

    }
}
