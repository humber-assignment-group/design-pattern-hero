package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public class Ring extends HeroDecorator{

    public Ring (Hero hero){
        super(hero);
        hero.increaseDefence(10);
    }

    @Override
    public void render() {
        System.out.println("Hero equipped with ring");
        hero.render();
    }

    @Override
    public void beAttack(int hp) {
        hero.beAttack(hp);
    }
}
