package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class DeathState extends State{

    public DeathState(Hero hero){ super(hero);}

    @Override
    void beAttacked(int hp) {
        context.reduceRestHp(hp);
        transitionState();
    }
}
