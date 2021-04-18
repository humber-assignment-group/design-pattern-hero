package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class NormalState implements State {

    private static NormalState instance = new NormalState();

    private NormalState(){}

    public static NormalState instance(){
        return instance;
    }

    @Override
    public void updateState(Hero hero){
        System.out.println("Hero at normal state");
        hero.setState(NormalState.instance());
    }
}
