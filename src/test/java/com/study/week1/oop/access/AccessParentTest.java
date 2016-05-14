package com.study.week1.oop.access;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.study.week1.oop.access.other.AccessChildren;

public class AccessParentTest {
	private AccessParent accessParent;
	private Another another;
	private AccessChildren accessChildren;
	
	@Before
	public void init() {
		accessParent = new AccessParent();
		another = new Another(accessParent);
		accessChildren = new AccessChildren();
	}
	
	
	/**
	 * Another Ŭ������ field�� AccessParent Ŭ������ ���� �ִ�.
	 * Another �� AccessParent �� ���� ��Ű���� ����������, default ������ �޼��带 ����� �� �ִ�.
	 */
	@Test
	public void another() {
		assertThat("Test�ڵ带 �����ؼ� �Ʒ� �ڵ带 �ذ��� ��", another.getAccessParentNameByDefault(), is("Another : AccessParent_Default"));

	}
	
	@Test
	public void testAccessNameByProtected() {
		assertThat("Test�ڵ带 �����ؼ� �Ʒ� �ڵ带 �ذ��� ��", accessChildren.getNameByProtected(), is("Child : AccessParent_Protected"));

	}

	@Test
	public void ��Ӱ�_����ȯ() throws Exception {
		assertThat(accessChildren.onlyChildren(), is("onlyChildren"));		
		assertThat(accessChildren.getNameByProtected(), is("Child : AccessParent_Protected"));
		
		AccessParent accessParentCasted = (AccessParent)accessChildren;		
//		accessChildrenCasted.onlyChildren();	compile error
		
		// TODO Test�ڵ带 �����ؼ� �Ʒ� fail�� �ذ�
		assertThat("parent �� ĳ���� ������, ��ü�� ������ children�� �Ӽ��� ���� �ִ�.", 
		accessParentCasted.getNameByProtected(), is("Child : AccessParent_Protected")); // �� �θ�� ĳ���� �Ȱ� �ƴѰ�??
	}
	
	@Test
	public void ���۷�_����ȯ() throws Exception {
		float f = 123.4f;
		int i = (int) f;
		
		assertThat("����", i, is(123));

		float f2 = i;

		// TODO Test�ڵ带 �����ؼ� �Ʒ� fail�� �ذ�
		assertThat("�����Ͱ� ���ǵƴ�!! primary type�� ĳ���ö� �����ؾ� ��.", f, is(123.4f));		
	}
	
	@Test(expected = ClassCastException.class)
	public void testException() throws Exception {
		/* Compile error  
		 * 
		 * AccessChildren parentToChildren = (AccessParent)accessParent
		 * AccessParent parent = (AccessParent)another;	// compile error
		 * 
		 * */
		
		Object obj = (Object)another;
		AccessParent parent = (AccessParent)obj;
		
		fail("Expect exception");  // <-- �� ������ ���� ���� ���� ����!!
		
		// TODO @Test annotation�� expected �� �̿��ؼ� �� �׽�Ʈ�� �ϼ��� �� 
	}
}
