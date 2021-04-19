package com.github.humbergroup.testing;

import com.github.humbergroup.decorator.Ring;
import com.github.humbergroup.decorator.Sword;
import com.github.humbergroup.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    public void tester(){
        Hero hero = new Hero("Sandeep", 5,5,5);
        Ring heroR = new Ring(hero);
        heroR.render();
        assertEquals(15, hero.getDefence());

        Hero heroS = new Hero("Sword",5,5,5);
        Sword hero2 = new Sword(heroS);
        hero2.render();
        assertEquals(7, heroS.getDefence());
        assertEquals(15, heroS.getAttack());

        Hero heroSR = new Hero("Sword",5,5,5);
        Sword hero3 = new Sword(new Ring(heroSR));
        hero3.render();
        assertEquals(17, heroSR.getDefence());
        assertEquals(15, heroSR.getAttack());

    }
}
