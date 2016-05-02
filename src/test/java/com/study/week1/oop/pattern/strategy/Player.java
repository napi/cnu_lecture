package com.study.week1.oop.pattern.strategy;

public class Player {
	private WeaponStrategy weaponStrategy;
	
	public Player(WeaponStrategy weaponStrategy) {
		this.weaponStrategy = weaponStrategy;
	}
	
	public int attack() {
		return this.weaponStrategy.damage();
	}
}
