package com.github.humbergroup.decorator;

/**
 * all things in the game can be treated as a role
 *
 * @author sandeep
 */
public interface Role {

    /**
     * be rendered in the monitor
     */
    void render();

    /**
     * be attacked with hp
     *
     * @param hp how many hp the role will reduce
     */
    void beAttacked(int hp);

    /**
     * increase extra defence
     *
     * @param defence the extra defence
     */
    void increaseDefence(int defence);

    /**
     * increase extra hp
     *
     * @param hp the extra hp
     */
    void increaseHp(int hp);

    /**
     * increase extra attack
     *
     * @param attack the extra attack
     */
    void increaseAttack(int attack);
}
