package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public class Ring {

    public Ring (Hero hero){
        hero.increaseHp(10);
    }

    public void render() {

    }
}
