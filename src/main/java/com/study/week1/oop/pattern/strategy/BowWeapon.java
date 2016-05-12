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
		// specification : 활의 공격력은 무기데미지 + Level
		return damage+level;
	}
}
