package com.github.humbergroup.Decorator;

import com.github.humbergroup.Hero;
import com.github.humbergroup.Role;

public abstract class HeroDecorator implements Role {
	
	Hero hero;
	
	public HeroDecorator (Hero hero) {
		this.hero = hero;
	}
	//testing
	
	public void render() {
		
	}
	
	public void beAttacked(int hp) {
		
	}

}
