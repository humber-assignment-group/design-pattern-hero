package test;

import com.github.humbergroup.Hero;
import com.github.humbergroup.state.NormalState;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @org.junit.jupiter.api.Test
    void normalStateTest() {
        Hero hero = new Hero("tester", 100, 1, 10);
        hero.beAttack(40);
        assertEquals(60, hero.getRestHp());
        System.out.println(hero.getHp());
        System.out.println(hero.getRestHp());
        System.out.println(hero.getHpPercent());
        System.out.println(hero.getState());
//        assertTrue(hero.getState() instanceof NormalState);
    }

    @org.junit.jupiter.api.Test
    void crazyStateTest() {

    }

    @org.junit.jupiter.api.Test
    void deathStateTest() {

    }
}