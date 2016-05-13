package com.study.week1.oop.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chair implements WeaponStrategy{
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

	enum Material {
		WOOD,
		STONE,
		IRON,
		CRISTAL
	}

	@Override
	public int damage() {
		// TODO Auto-generated method stub
		if(material.equals(material.CRISTAL)){
			return 100;
		}
		return 2;
	}
}
