package com.github.humbergroup.testing;

import com.github.humbergroup.Hero;
import com.github.humbergroup.factory.HeroName;
import com.github.humbergroup.observer.MessageBroadcast;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void test() {
        HeroName name = HeroName.Aatrox;
        Hero hero = new Hero(name.name(), name.getHp(), name.getDefence(), name.getAttack());

        MessageBroadcast bc = new MessageBroadcast();
        bc.register(hero);
        bc.noticeObserver("Hello");
    }
}
