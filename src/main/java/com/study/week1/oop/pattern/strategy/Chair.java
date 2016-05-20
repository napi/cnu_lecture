package com.study.week1.oop.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chair implements WeaponStrategy {
	Logger log = LoggerFactory.getLogger(this.getClass());
	private Material material;
	
	
	public Chair(Material material) {
		this.material = material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public void sit(Player player) {
		log.info("[{}] 님이 의자에 앉아 휴식을 취합니다", player.getName());
	}

	@Override
	public int damage() {
		return this.material.getDamage();
	}

	enum Material {
		WOOD(2),
		STONE(2),
		IRON(2),
		CRISTAL(100);

		private final int damage;

		Material(int damage) {
			this.damage = damage;
		}

		public int getDamage() {
			return damage;
		}
	}

	@Override
	public int damage() {
		switch(material){
			case WOOD:
				return 2;
			case CRISTAL:
				return 100;
			default:
				return 0;
		}
	}
}
