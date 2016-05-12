package com.study.week1.oop.pattern.strategy;

public class AxeWeapon implements WeaponStrategy {
	private int level;
	private float damage;
	
	public AxeWeapon(int level, float damage) {
		this.level = level;
		this.damage = damage;
	}

	@Override
	public int damage() {
		return (int)(level * damage);
	}
}
