package com.study.week1.oop.pattern.strategy;

public class SwardWeapon implements WeaponStrategy {
	private int damage;
	
	public SwardWeapon(int damage) {
		this.damage = damage;
	}

	@Override
	public int damage() {
		return damage * 2;
	}
}
