package com.github.humbergroup.testing;

import com.github.humbergroup.Decorator.Ring;
import com.github.humbergroup.Decorator.Sword;
import com.github.humbergroup.Hero;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void tester(){
        Hero hero = new Hero("Sandeep", 5,5,5);
        Ring heroR = new Ring(hero);
        Sword heroS = new Sword(hero);
        heroR.render();

        heroS.render();
    }
}