package com.github.humbergroup.testing;

import com.github.humbergroup.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeroTest {

    @ParameterizedTest
    @CsvSource({
            "a,100,80,100",
            "b,1000,10,200",
    })
    public void createTest(String name, int hp, int defence, int attack) {
        Hero hero = new Hero(name, hp, defence, attack);
        assertEquals(name, hero.getName());
        assertEquals(hp, hero.getHp());
        assertEquals(defence, hero.getDefence());
        assertEquals(attack, hero.getAttack());

    }
}
