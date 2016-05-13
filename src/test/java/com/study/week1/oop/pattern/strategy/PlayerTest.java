package com.study.week1.oop.pattern.strategy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class PlayerTest {
	@Test
	public void testSward() throws Exception {
		Player player = new Player(new SwardWeapon(10));
		
		assertThat("칼은 데미지가 * 2", player.attack(), is(20));
	}
	
	@Test
	public void testBow() throws Exception {
		Player player = new Player(new BowWeapon(10, 4));
		
		assertThat("활은 데미지가 레벨에 따라 달라진다.", player.attack(), is(14));
	}

	@Test
	public void testAxe() throws Exception {
		Player player = new Player(new AxeWeapon(10, 2.4f));
		
		assertThat("도끼는 데미지가 무게에 따라 달라진다.", player.attack(), is(20));
	}

	@Test
	public void testSecretWeapon() throws Exception {
		/**
		 * TODO
		 * 테스트코드 변경하지말고 성공으로 week1에 pull request.houl
		 * 전설의 무기를 만드세요.
		 * 전설의 무기는 바로 크리스탈 의자입니다!
		 * 평소에는 데미지가 1로 고정이지만, 크리스탈 의자는 100의 고정데미지를 입힙니다.
		 */
		
		Player player = new Player(new SwardWeapon(30));
		
//		TODO Player player = new Player(new Chair());
		
		assertThat("기본 재료의 의자는 1의 데미지만 입힙니다.", player.attack(), is(1));
		assertThat("크리스탈 의자는 100의 데미지를 입힙니다.", player.attack(), is(100));
	}
	
}
