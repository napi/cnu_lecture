package com.study.week1.oop.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Player {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private String name;
	private WeaponStrategy weaponStrategy;
	
	public Player(WeaponStrategy weaponStrategy) {
		this.weaponStrategy = weaponStrategy;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int attack() {
		log.info("[{}] 가 공격을 시작합니다");
		return this.weaponStrategy.damage();
	}
	
}
