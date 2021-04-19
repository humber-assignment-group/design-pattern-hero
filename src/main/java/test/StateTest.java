package test;

import com.github.humbergroup.Hero;
import com.github.humbergroup.state.CrazyState;
import com.github.humbergroup.state.DeathState;
import com.github.humbergroup.state.NormalState;
import com.github.humbergroup.state.State;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @org.junit.jupiter.api.Test
    void normalStateTest() {
        Hero hero = new Hero("tester", 100, 1, 10);
        hero.beAttack(40);
        assertEquals(60, hero.getRestHp());
        assertTrue(hero.getState() instanceof NormalState);
    }

    @org.junit.jupiter.api.Test
    void crazyStateTest() {
        Hero hero = new Hero("tester", 100, 1, 10);
        hero.beAttack(95);
        assertEquals(5, hero.getRestHp());
        System.out.println(hero.getHpPercent());
        System.out.println(hero.getState());
        assertTrue(hero.getState() instanceof CrazyState);
    }

    @org.junit.jupiter.api.Test
    void deathStateTest() {
        Hero hero = new Hero("tester", 100, 1, 10);
        hero.beAttack(100);
        assertEquals(0, hero.getRestHp());
        System.out.println(hero.getHpPercent());
        System.out.println(hero.getState());
        System.out.println(State.InitialState(hero));
        assertTrue(hero.getState() instanceof DeathState);
    }
}