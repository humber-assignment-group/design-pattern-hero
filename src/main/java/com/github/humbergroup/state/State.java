package com.github.humbergroup.state;


import com.github.humbergroup.Hero;

public abstract class State {

    private final Hero context;

    public State(Hero context){
        this.context = context;
    }

    public static State InitialState(Hero context){

        return null;
    }

    private void transitionState(){

    }

    abstract void beAttacked(int hp);

}
