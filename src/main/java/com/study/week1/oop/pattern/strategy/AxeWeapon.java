package com.study.week1.oop.pattern.strategy;

public class AxeWeapon implements WeaponStrategy {
	private int damage;
	private float weight;
	
	public AxeWeapon(int damage, float weight) {
		this.damage = damage;
		this.weight = weight;
	}

	@Override
	public int damage() {
	    // 도끼의 데미지는 damage와 weight를 곱한 값이다.
		return (int)(damage * weight);
	}
}
