package com.study.week1.oop.pattern.singleton;

/**
 * Head first Design patterns 참고
 * 
 * 1. 아무도 해당 클래스의 인스턴스를 마음대로 만들 수 없어야 한다.
 * 2. 해당 클래스(객체)를 사용하려면 미리 정해진 방법으로 접근해서 사용해야 한다.
 * 
 * 아래 코드는 getInstance() 를 호출할때 동기화 문제가 발생할 수 있다.
 * -> synchronized 로 해결
 * -> synchronized 는 비용이 크다. 아래 코드에서는 비효율적임
 * 
 * @author rokim
 *
 */
public class OldSingleton {
	private static OldSingleton uniqueInstance;

	private OldSingleton() {
		
	}
	
	public static OldSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new OldSingleton();
		}
		
		return uniqueInstance;
	}
}
