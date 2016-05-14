package com.study.week1.oop.pattern.strategy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	private Player player;
	
	@Before
	public void init() {
		player = new Player("Riven");
	}

	/**
	 * 칼의 공격력은 무기데미지 * 2 이다. 
	 * @throws Exception
	 */
	@Test
	public void testSward() throws Exception {
		player.setWeapon(new SwardWeapon(10));
		
		assertThat("칼은 데미지가 * 2", player.attack(), is(20));
	}
	
	/**
	 * 활의 공격력은 무기데미지 + Level 이다. 
	 * @throws Exception
	 */
	@Test
	public void testBow() throws Exception {
		// TODO BowWeapon 코드를 수정해서 Test 코드를 고치시오.
		player.setWeapon(new BowWeapon(10, 4));
		assertThat("활의 데미지의 데미지 계산이 잘못 됐다. 스팩 확인", player.attack(), is(14));
		
		player.setWeapon(new BowWeapon(10, 6));
		assertThat("활의 데미지의 데미지 계산이 잘못 됐다. 스팩 확인", player.attack(), is(16));
	}

	/**
	 * 도끼의 공격력은 무기데미지 * Level 이다. 
	 * @throws Exception
	 */
	@Test
	public void testAxe() throws Exception {
		// TODO AxeWeapon 코드를 수정해서 Test 코드를 고치시오.

		player.setWeapon(new AxeWeapon(10, 2.4f));
		assertThat("도끼의 데미지의 데미지 계산이 잘못 됐다. 스팩 확인", player.attack(), is(24));
		
		player.setWeapon(new AxeWeapon(10, 1.5f));
		assertThat("도끼의 데미지의 데미지 계산이 잘못 됐다. 스팩 확인", player.attack(), is(15));
	}

	/**
	 * 전설의 무기는 크리스탈 의자.
	 * 
	 * 다른 의자는 모두 데미지가 2로 고정이다.
	 * 전설의 의자(크리스탈 의자)는 100의 고정 데미지를 입힌다.
	 * @throws Exception
	 */
	@Test
	public void testSecretWeapon() throws Exception {
		Chair chair = new Chair(Chair.Material.WOOD);
	
		/**
		 * 아래 setWeapon 에 chair 을 넣으면 compile error가 난다.
		 * chair 에 WeaponStrategy 를 구현하면 compile error 가 사라질 것이다. 
		 */
//		TODO 아래쪽 라인 player.setWeapon(chair); 이 컴파일 오류가 나지 않으며, assertThat 테스트 구문이 통과하도록 Chair.java 파일을 수정하라.
		player.setWeapon(chair);
		
		assertThat("기본 재료의 의자는 2의 데미지만 입힙니다.", player.attack(), is(2));
		chair.setMaterial(Chair.Material.CRISTAL);
		assertThat("크리스탈 의자는 100의 데미지를 입힙니다.", player.attack(), is(100));
	}
}
