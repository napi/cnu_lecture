package com.study.week1.oop.pattern.strategy;

public class BowWeapon implements WeaponStrategy {
	private int damage;
	private int level;
	
	public BowWeapon(int damage, int level) {
		this.damage = damage;
		this.level = level;
	}

	@Override
	public int damage() {
		return damage + level;
	}
}
