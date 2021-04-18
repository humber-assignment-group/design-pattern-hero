package com.github.humbergroup.state;

import com.github.humbergroup.Hero;

public class DeathState implements State{

    private static DeathState instance = new DeathState();

    private DeathState(){}

    public static DeathState instance(){
        return instance;
    }

    @Override
    public void updateState(Hero hero){
        System.out.println("Hero at death state");
        hero.setState(DeathState.instance());
    }
}
