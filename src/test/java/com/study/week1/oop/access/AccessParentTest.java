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
		assertThat("Test코드를 수정해서 아래 코드를 해결할 것", another.getAccessParentNameByDefault(), is("Another : AccessParent_Default"));
	}
	
	@Test
	public void testAccessNameByProtected() {
		assertThat("Test코드를 수정해서 아래 코드를 해결할 것", accessChildren.getNameByProtected(), is("Child : AccessParent_Protected"));
	}

	@Test
	public void 상속과_형변환() throws Exception {
		assertThat(accessChildren.onlyChildren(), is("onlyChildren"));		
		assertThat(accessChildren.getNameByProtected(), is("Child : AccessParent_Protected"));
		
		AccessParent accessParentCasted = (AccessParent)accessChildren;		
//		accessChildrenCasted.onlyChildren();	compile error
		
		// TODO Test코드를 수정해서 아래 fail을 해결
		assertThat("parent 로 캐스팅 됐지만, 객체는 여전히 children의 속성을 갖고 있다.", 
				accessParentCasted.getNameByProtected(), is("Child : AccessParent_Protected")); // 나 부모로 캐스팅 된거 아닌가??
	}
	
	@Test
	public void 랩퍼러_형변환() throws Exception {
		float f = 123.4f;
		int i = (int) f;
		
		assertThat("정상", i, is(123));

		float f2 = i;

		// TODO Test코드를 수정해서 아래 fail을 해결
		assertThat("데이터가 유실됐다!! primary type은 캐스팅때 조심해야 함.", f2, is(123.0f));		
	}
	
	@Test (expected=ClassCastException.class)
	public void testException() throws Exception {
		/* Compile error  
		 * 
		 * AccessChildren parentToChildren = (AccessParent)accessParent
		 * AccessParent parent = (AccessParent)another;	// compile error
		 * 
		 * */
		
		Object obj = (Object)another;
		AccessParent parent = (AccessParent)obj;
		
		fail("Expect exception");  // <-- 이 라인은 절대 삭제 하지 말것!!
		
		// TODO @Test annotation의 expected 를 이용해서 이 테스트를 완성할 것 
	}
}
