package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class CrazyState extends State{

    public CrazyState(Hero hero){ super(hero);}

    @Override
    public void beAttacked(int hp) {
        context.reduceRestHp(hp);
        transitionState();
    }
}
