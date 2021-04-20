package com.github.humbergroup.testing;

import com.github.humbergroup.Hero;
import com.github.humbergroup.factory.HeroFactory;
import com.github.humbergroup.factory.HeroName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    @Test
    public void test1(){
        HeroName name = HeroName.Zyra;
        Hero hero = HeroFactory.getInstance().create(name);
        assertEquals(name.name(), hero.getName());
        assertEquals(name.getHp(), hero.getHp());
        assertEquals(name.getDefence(), hero.getDefence());
        assertEquals(name.getAttack(), hero.getAttack());
    }

    @Test
    public void test2(){
        HeroName name = HeroName.Anivia;
        Hero hero = HeroFactory.getInstance().create(name);
        assertEquals(name.name(), hero.getName());
        assertEquals(name.getHp(), hero.getHp());
        assertEquals(name.getDefence(), hero.getDefence());
        assertEquals(name.getAttack(), hero.getAttack());
    }

    @Test
    public void test3(){
        HeroName name = HeroName.Blitzcrank;
        Hero hero = HeroFactory.getInstance().create(name);
        assertEquals(name.name(), hero.getName());
        assertEquals(name.getHp(), hero.getHp());
        assertEquals(name.getDefence(), hero.getDefence());
        assertEquals(name.getAttack(), hero.getAttack());
    }
}
