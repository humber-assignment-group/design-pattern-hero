package com.github.humbergroup.decorator;

public interface Role {

    void render();

    void beAttacked(int hp);

    void increaseDefence(int defence);

    void increaseHp(int hp);

    void increaseAttack(int attack);
}
