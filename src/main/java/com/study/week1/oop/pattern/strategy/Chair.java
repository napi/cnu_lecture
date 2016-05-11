package com.study.week1.oop.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chair implements WeaponStrategy {
	Logger log = LoggerFactory.getLogger(this.getClass());
	private Material material;
	private int damage;
	
	
	public Chair(Material material) {
		this.material = material;
		if(material.equals(material.CRISTAL))
			damage=100;
		else 
			damage=2;
	

	}
	
	public void setMaterial(Material material) {
		this.material = material;
		if(material.equals(material.CRISTAL))
			damage=100;
		else 
			damage=2;
	}
	
	public Material getMaterial() {
		return material;
	}

	public void sit(Player player) {
		log.info("[{}] 님이 의자에 앉아 휴식을 취합니다", player.getName());
	}

	enum Material {
		WOOD,
		STONE,
		IRON,
		CRISTAL
	}

	@Override
	public int damage(){
		System.out.println(damage);
		return damage;
	}
}
