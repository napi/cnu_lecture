package com.study.week1.oop.access;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

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
	
	@Test
	public void parent() {
		accessParent.getNameByPublic();
		accessParent.getNameByProtected();
		accessParent.getNameByDefault();
//		accessParent.getName();	 This is compile error.
		
		assertThat("Test코드를 수정해서 아래 코드를 해결할 것", accessParent.getNameByDefault(), is("AccessParent"));
	}
	
	@Test
	public void another() {
		assertThat("AccessParent와 Another코드를 수정해서 해결.", another.getAccessParentName(), is("AccessParent"));
	}

	@Test
	public void 상속과_형변환() throws Exception {
		assertThat(accessChildren.onlyChildren(), is("onlyChildren"));		
		assertThat(accessChildren.getNameByProtected(), is("Child : AccessParent_Protected"));
		
		AccessParent accessChildrenCasted = (AccessParent)accessChildren;		
//		accessChildrenCasted.onlyChildren();	compile error
		
		assertThat("나 부모로 캐스팅 된거 아닌가?", accessParent.getNameByProtected(), is("AccessParent_Protected"));
	}
	
	@Test
	public void testException() throws Exception {
		Object obj = (Object)another;
		AccessParent parent = (AccessParent)obj;
		
		fail("Expect exception");
	}
}
