package com.github.humbergroup.state;


import com.github.humbergroup.Hero;

public abstract class State {

    public final Hero context;

    public State(Hero context) {
        this.context = context;
    }

    /**
     * initial state based on context's hp percent.
     *
     * @param context hero
     * @return the associated state
     */
    public static State InitialState(Hero context) {
        double hp = context.getHpPercent();
        if (hp > 10) {
            return new NormalState(context);
        } else if (0 < hp && hp <= 10) {
            return new CrazyState(context);
        }
        return new DeathState(context);
    }

    /**
     * transit state after be attacked
     */
    protected void transitionState() {
        double hp = context.getHpPercent();
        if (hp > 10 && !(this instanceof NormalState)) {
            context.setState(new NormalState(context));
        } else if (0 < hp && hp <= 10 && !(this instanceof CrazyState)) {
            context.setState(new CrazyState(context));
        } else if (hp <= 0 && !(this instanceof DeathState)) {
            context.setState(new DeathState(context));
        }
    }

    public abstract void beAttacked(int hp);

}
