package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public class Ring extends HeroDecorator{

    public Ring (Hero hero){
        super(hero);
        hero.increaseHp(10);
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
