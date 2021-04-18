package com.github.humbergroup;

import com.github.humbergroup.observer.Observer;

public class Hero implements Observer {

    private String name;

    private int hp;

    private int restHp;

    private int defence;

    private int attack;

    public Hero(String name, int hp, int defence, int attack) {
        this.name = name;
        this.hp = hp;
        this.restHp = hp;
        this.defence = defence;
        this.attack = attack;
    }

    @Override
    public void update(String message) {

    }

    public void render() {
        System.out.println("do something");
    }

    public void beAttack(int hp) {

    }

    public void increaseHp(int hp) {
        this.hp += 1;
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
        return hp * 1.0 / restHp;
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
}
