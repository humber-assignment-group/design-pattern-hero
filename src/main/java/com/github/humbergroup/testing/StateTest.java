package com.github.humbergroup.testing;

import com.github.humbergroup.Hero;
import com.github.humbergroup.state.CrazyState;
import com.github.humbergroup.state.DeathState;
import com.github.humbergroup.state.NormalState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StateTest {

    @Test
    void normalStateTest() {
        Hero hero = new Hero("Sandeep", 100, 1, 10);
        hero.beAttacked(40);
        assertEquals(60, hero.getRestHp());
        assertTrue(hero.getState() instanceof NormalState);
    }

    @Test
    void crazyStateTest() {
        Hero hero = new Hero("Ji", 100, 1, 10);
        hero.beAttacked(95);
        assertEquals(5, hero.getRestHp());
        assertTrue(hero.getState() instanceof CrazyState);
    }

    @Test
    void deathStateTest() {
        Hero hero = new Hero("Ferris", 100, 1, 10);
        hero.beAttacked(100);
        assertEquals(0, hero.getRestHp());
        assertTrue(hero.getState() instanceof DeathState);
    }
}