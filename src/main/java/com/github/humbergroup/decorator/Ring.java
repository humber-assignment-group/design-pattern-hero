package com.github.humbergroup.decorator;

/**
 * Ring can give role 10 extra defence
 */
public class Ring extends HeroDecorator {

    public Ring(Role hero) {
        super(hero);
        hero.increaseDefence(10);
    }

    @Override
    public void render() {
        System.out.println("Hero equipped with ring");
        hero.render();
    }
}
