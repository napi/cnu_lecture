package com.study.week1.oop.pattern.strategy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chair implements WeaponStrategy {//implements 추가
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

	//아래는 implement로 인한 추가된 메소드
	@Override
	public int damage() {
		// PlayerTest 클래스의 assetThat을 보면 데미지가 정해져있음.
		if(this.material.equals(Material.CRISTAL)){//assertThat("크리스탈 의자는 100의 데미지를 입힙니다.", player.attack(), is(100));
			return 100;
		}
		else
			return 2;//wood든 아니든 기본 2라고 한다..
		
	}
}
