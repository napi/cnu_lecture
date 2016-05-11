package com.study.week1.oop.pattern.observer;

public interface Observer {
	/**
	 * public abstract void update
	 * public void update
	 * void update
	 * 
	 * @param temperature 온도
	 * @param humidity 습도
	 * @param pressure 기압
	 */
	public void update(float temperature, float humidity, float pressure);
}
//API만 만들어준것. 정의만 해준것. 구현은 니가해