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
	 * Į�� ���ݷ��� ���ⵥ���� * 2 �̴�. 
	 * @throws Exception
	 */
	@Test
	public void testSward() throws Exception {
		player.setWeapon(new SwardWeapon(10));
		
		assertThat("Į�� �������� * 2", player.attack(), is(20));
	}
	
	/**
	 * Ȱ�� ���ݷ��� ���ⵥ���� + Level �̴�. 
	 * @throws Exception
	 */
	@Test
	public void testBow() throws Exception {
		// TODO BowWeapon �ڵ带 �����ؼ� Test �ڵ带 ��ġ�ÿ�.
		player.setWeapon(new BowWeapon(10, 4));
		assertThat("Ȱ�� �������� ������ ����� �߸� �ƴ�. ���� Ȯ��", player.attack(), is(14));
		
		player.setWeapon(new BowWeapon(10, 6));
		assertThat("Ȱ�� �������� ������ ����� �߸� �ƴ�. ���� Ȯ��", player.attack(), is(16));
	}

	/**
	 * ������ ���ݷ��� ���ⵥ���� * Level �̴�. 
	 * @throws Exception
	 */
	@Test
	public void testAxe() throws Exception {
		// TODO AxeWeapon �ڵ带 �����ؼ� Test �ڵ带 ��ġ�ÿ�.

		player.setWeapon(new AxeWeapon(10, 2.4f));
		assertThat("������ �������� ������ ����� �߸� �ƴ�. ���� Ȯ��", player.attack(), is(24));
		
		player.setWeapon(new AxeWeapon(10, 1.5f));
		assertThat("������ �������� ������ ����� �߸� �ƴ�. ���� Ȯ��", player.attack(), is(15));
	}

	/**
	 * ������ ����� ũ����Ż ����.
	 * 
	 * �ٸ� ���ڴ� ��� �������� 2�� �����̴�.
	 * ������ ����(ũ����Ż ����)�� 100�� ���� �������� ������.
	 * @throws Exception
	 */
	@Test
	public void testSecretWeapon() throws Exception {
		Chair chair = new Chair(Chair.Material.WOOD);
	
		/**
		 * �Ʒ� setWeapon �� chair �� ������ compile error�� ����.
		 * chair �� WeaponStrategy �� �����ϸ� compile error �� ����� ���̴�. 
		 */
//		TODO �Ʒ��� ���� player.setWeapon(chair); �� ������ ������ ���� ������, assertThat �׽�Ʈ ������ ����ϵ��� Chair.java ������ �����϶�.
		player.setWeapon(chair);
		
		assertThat("�⺻ ����� ���ڴ� 2�� �������� �����ϴ�.", player.attack(), is(2));
		chair.setMaterial(Chair.Material.CRISTAL);
		assertThat("ũ����Ż ���ڴ� 100�� �������� �����ϴ�.", player.attack(), is(100));
	}
}
