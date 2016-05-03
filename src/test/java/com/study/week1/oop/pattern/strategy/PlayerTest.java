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
	public void testLegend() throws Exception {
		/**
		 * TODO
		 * 
		 * 전설의 무기를 만드세요.
		 * 전설의 무기는 데미지가 5로 고정입니다.
		 * 레벨에 비례하여 데미지가 증가합니다.
		 */
//		Player player = new Player(new LegendWeapon());
		
		fail("전설의 무기는 데미지가 기본데미지가 5로 고정이며, 레벨에 비례하여 증가한다.");
	}
	
}
