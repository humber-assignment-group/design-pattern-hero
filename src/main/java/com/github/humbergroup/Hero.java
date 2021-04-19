package com.github.humbergroup;

import com.github.humbergroup.Decorator.Role;
import com.github.humbergroup.observer.Observer;
import com.github.humbergroup.state.State;

public class Hero implements Observer, Role {

    private final String name;

    private int hp;

    private int restHp;

    private int defence;

    private int attack;

    private State state;

    public Hero(String name, int hp, int defence, int attack) {
        this.name = name;
        this.hp = hp;
        this.restHp = hp;
        this.defence = defence;
        this.attack = attack;
        this.state = State.InitialState(this);

    }

    @Override
    public void update(String message) {
        System.out.printf("Hero %s receive message: %s\n", this.name, message);
    }

    @Override
    public void render() {
        System.out.printf("Hero: %s with %d/%d (%.2f) hp, %d defence, %d attack\n",
                this.name, this.restHp, this.hp, this.getHpPercent(), this.defence, this.attack);
    }

    @Override
    public void beAttack(int hp) {
        this.restHp -= hp;
    }

    public void increaseHp(int hp) {
        double percent = getHpPercent();
        this.hp += hp;
        this.restHp = (int) (this.hp * percent);
    }

    public void reduceRestHp(int hp) {
        this.restHp = Math.max(this.restHp - hp, 0);
    }

    public void increaseDefence(int defence) {
        this.defence += defence;
    }

    public void increaseAttack(int attack) {
        this.attack += attack;
    }

    public String getName() {
        return name;
    }

    public double getHpPercent() {
        return restHp / (double)hp * 100;
    }

    public int getHp() {
        return hp;
    }

    public int getRestHp() {
        return restHp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
