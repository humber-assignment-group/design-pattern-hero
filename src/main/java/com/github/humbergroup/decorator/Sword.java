package com.github.humbergroup.decorator;

import com.github.humbergroup.Hero;

public class Sword extends HeroDecorator{

    public Sword (Hero hero){
        super(hero);
        hero.increaseDefence(2);
        hero.increaseAttack(10);
    }

    @Override
    public void render() {
        System.out.println("Hero equipped with Sword");
        hero.render();
    }
}
