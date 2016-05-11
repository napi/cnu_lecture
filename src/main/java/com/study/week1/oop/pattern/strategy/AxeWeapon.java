package com.study.week1.oop.pattern.strategy;

public class AxeWeapon implements WeaponStrategy {
	private int damage;
	private float level;
	
	public AxeWeapon(int damage, float level) {
		this.damage = (int)(damage*level);
	}

	@Override
	public int damage() {
		return (int)(damage);
	}
}
