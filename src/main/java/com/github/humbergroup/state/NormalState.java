package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class NormalState extends State {

    public NormalState(Hero hero){ super(hero);}

    @Override
    void beAttacked(int hp) {
        System.out.println("Hero condition normal");
    }
}
