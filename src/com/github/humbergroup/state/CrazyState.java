package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class CrazyState implements State{

    private static CrazyState instance = new CrazyState();

    private CrazyState(){}

    public static CrazyState instance(){
        return instance;
    }

    @Override
    public void updateState(Hero hero){
        System.out.println("Hero at crazy state");
        hero.setState(CrazyState.instance());
    }
}
