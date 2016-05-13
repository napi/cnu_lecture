package com.study.week1.oop.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

<<<<<<< HEAD
public class Chair implements WeaponStrategy{
=======
public class Chair {
>>>>>>> upstream/week1
	Logger log = LoggerFactory.getLogger(this.getClass());
	private Material material;
	
	
	public Chair(Material material) {
		this.material = material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
<<<<<<< HEAD
	@Override
	public int damage() {
		if(this.material == Material.WOOD) return 2;
		else if(this.material == Material.CRISTAL) return 100;
		else return 0;
	}
	
=======
>>>>>>> upstream/week1
	public void sit(Player player) {
		log.info("[{}] 님이 의자에 앉아 휴식을 취합니다", player.getName());
	}

	enum Material {
		WOOD,
		STONE,
		IRON,
		CRISTAL
	}
}
