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
		return (int)(damage * weight); //assertThat is 내용을 보면 더하는게 아닌 곱하는거임
	}
}
