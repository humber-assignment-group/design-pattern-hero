package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;

public abstract class HeroDecorator implements Role {
	
	Hero hero;

	public HeroDecorator (Hero hero) {
		this.hero = hero;
	}


	public void render() {
		
	}
	
	public void beAttacked(int hp) {
		
	}

}
