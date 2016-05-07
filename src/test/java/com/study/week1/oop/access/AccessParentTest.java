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
	 * Another 클래스는 field로 AccessParent 클래스를 갖고 있다.
	 * Another 과 AccessParent 는 같은 패키지에 존재함으로, default 접근자 메서드를 사용할 수 있다.
	 */
	@Test
	public void another() {
		assertThat("Test코드를 수정해서 아래 코드를 해결할 것", another.getAccessParentNameByDefault(), is("AccessParent"));
	}
	
	@Test
	public void testAccessNameByDefault() {
		assertThat("Children이 왜 Default 접근자를 사용해야 하는가? 정말로 필요하다면, 같은 페키지에 아답타를 만든다.", accessChildren.getNameByProtected(), is("AccessParent_Default"));
	}

	@Test
	public void 상속과_형변환() throws Exception {
		assertThat(accessChildren.onlyChildren(), is("onlyChildren"));		
		assertThat(accessChildren.getNameByProtected(), is("Child : AccessParent_Protected"));
		
		AccessParent accessChildrenCasted = (AccessParent)accessChildren;		
//		accessChildrenCasted.onlyChildren();	compile error
		
		assertThat("나 부모로 캐스팅 된거 아닌가?", accessChildrenCasted.getNameByProtected(), is("AccessParent_Protected"));
	}
	
	@Test
	public void 래퍼러_형변환() throws Exception {
		float f = 123.4f;
		int i = (int) f;
		
		assertThat("정상", i, is(123));

		float f2 = i;
		assertThat("데이터가 유실됐다!! primary type은 캐스팅때 조심해야 함.", f2, is(123.4f));		
	}
	
	@Test
	public void testException() throws Exception {
//		AccessParent parent2 = (AccessParent)another;	// compile error
		
		Object obj = (Object)another;
		AccessParent parent = (AccessParent)obj;
		
		fail("Expect exception");
	}
}
