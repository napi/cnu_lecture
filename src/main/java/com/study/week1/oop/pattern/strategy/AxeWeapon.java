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
<<<<<<< HEAD
		return (int)(damage * weight);
=======
		return (int)(damage + weight);
>>>>>>> upstream/week1
	}
}
