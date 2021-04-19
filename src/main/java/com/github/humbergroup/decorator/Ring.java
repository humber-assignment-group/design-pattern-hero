package com.github.humbergroup.decorator;

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
}
