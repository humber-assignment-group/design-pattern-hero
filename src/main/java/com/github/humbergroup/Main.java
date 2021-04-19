package com.github.humbergroup;

import com.github.humbergroup.decorator.Ring;
import com.github.humbergroup.decorator.Role;
import com.github.humbergroup.decorator.Sword;
import com.github.humbergroup.factory.HeroFactory;
import com.github.humbergroup.factory.HeroName;
import com.github.humbergroup.observer.MessageBroadcast;

public class Main {

    public static void main(String[] args) {
        MessageBroadcast bc = new MessageBroadcast();
        Hero hero = HeroFactory.getInstance().create(HeroName.Aatrox);
        bc.register(hero);
        bc.noticeObserver("Hello World");

        hero.render();
        Role role = new Sword(new Ring(hero));
        role.render();

        hero.beAttacked(HeroName.Aatrox.getHp());
        System.out.println(hero.getState());
    }
}
