package com.github.humbergroup.decorator;

/**
 * Sword can give role 2 extra defence and 10 extra attack
 */
public class Sword extends HeroDecorator {

    public Sword(Role hero) {
        super(hero);
        hero.increaseDefence(2);
        hero.increaseAttack(10);
    }

    @Override
    public void render() {
        System.out.println("Hero equipped with Sword");
        hero.render();
    }
}
