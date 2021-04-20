package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class DeathState extends State{

    public DeathState(Hero hero){ super(hero);}

    @Override
    public void beAttacked(int hp) {
        System.out.println("I am died now");
        context.reduceRestHp(hp);
        transitionState();
    }
}
