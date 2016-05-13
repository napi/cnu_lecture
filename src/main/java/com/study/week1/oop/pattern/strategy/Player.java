package com.study.week1.oop.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Player {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private String name;
	private WeaponStrategy weaponStrategy;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void setWeapon(Object obj) {
		WeaponStrategy strategy = (WeaponStrategy)obj;
		this.weaponStrategy = strategy;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int attack() {
		if (weaponStrategy == null) {
			log.info("[{}] 가 맨손으로 공격하여 {}의 데미지를 가합니다.", name, 1);
			return 1;
		}
		
		log.info("[{}] 가 공격하여 {}의 데미지를 가합니다.", name, this.weaponStrategy.damage());	
		return this.weaponStrategy.damage();
	}

}
