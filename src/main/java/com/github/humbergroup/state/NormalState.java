package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class NormalState extends State {

    public NormalState(Hero hero){ super(hero);}

    @Override
    public void beAttacked(int hp) {
        context.reduceRestHp(hp);
        transitionState();
    }
}
