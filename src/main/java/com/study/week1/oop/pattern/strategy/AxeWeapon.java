package com.study.week1.oop.pattern.strategy;

public class AxeWeapon implements WeaponStrategy {
	private int level;
	private float damage;
	
	public AxeWeapon(int damage, float weight) {
		this.level = damage;
		this.damage = weight;
	}

	@Override
	public int damage() {
		return (int)(level * damage);
	}
}
