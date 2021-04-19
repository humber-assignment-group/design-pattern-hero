package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public abstract class HeroDecorator implements Role {

	protected Hero hero;

	public HeroDecorator (Hero hero) {
		this.hero = hero;
	}


	public void render() {
		hero.render();
	}
	
	public void beAttacked(int hp) {
		hero.beAttack(hp);
	}


}
