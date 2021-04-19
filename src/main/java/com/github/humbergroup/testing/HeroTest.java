package com.github.humbergroup.testing;

import com.github.humbergroup.Hero;
import com.github.humbergroup.factory.HeroName;
import org.junit.jupiter.api.Test;
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

    @Test
    public void increaseDefence() {
        HeroName name = HeroName.Aatrox;
        Hero hero = new Hero(name.name(), name.getHp(), name.getDefence(), name.getAttack());
        hero.increaseDefence(2);
        assertEquals(name.getDefence() + 2, hero.getDefence());
    }

    @Test
    public void increaseAttack() {
        HeroName name = HeroName.Aatrox;
        Hero hero = new Hero(name.name(), name.getHp(), name.getDefence(), name.getAttack());
        hero.increaseAttack(2);
        assertEquals(name.getAttack() + 2, hero.getAttack());
    }

    @Test
    public void increaseHp() {
        HeroName name = HeroName.Aatrox;
        Hero hero = new Hero(name.name(), name.getHp(), name.getDefence(), name.getAttack());
        hero.increaseHp(2);
        assertEquals(name.getHp() + 2, hero.getHp());
    }

    @Test
    public void reduceRestHp() {
        HeroName name = HeroName.Aatrox;
        Hero hero = new Hero(name.name(), name.getHp(), name.getDefence(), name.getAttack());
        hero.reduceRestHp(2);
        assertEquals(name.getHp() - 2, hero.getRestHp());

        hero.reduceRestHp(name.getHp());
        assertEquals(0, hero.getRestHp());
    }
}
