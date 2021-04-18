package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public class Ring extends HeroDecorator{

    public Ring (Hero hero){
        super(hero);
        hero.increaseHp(10);
    }

    public void render() {

    }

    @Override
    public void beAttack(int hp) {

    }
}
