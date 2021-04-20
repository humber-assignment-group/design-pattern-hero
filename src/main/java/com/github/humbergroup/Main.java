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
        System.out.println("----------------");

        hero.render();
        System.out.println("----------------");

        Role role = new Sword(new Ring(hero));
        role.render();
        System.out.println("----------------");

        hero.beAttacked(HeroName.Aatrox.getHp());
        System.out.println(hero.getState());
        System.out.println("----------------");
    }
}
