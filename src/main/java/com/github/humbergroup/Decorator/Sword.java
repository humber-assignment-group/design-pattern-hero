package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public class Sword {

    public Sword (Hero hero){
        hero.increaseDefence(2);
        hero.increaseAttack(10);
    }

    public void render() {

    }
}
