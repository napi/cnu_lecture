package com.study.week1.oop.pattern.observer;

public class RadioObserver implements Observer {
	private int frequency;
	
	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public void broadcast(String s) {
		System.out.println(s);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		broadcast(String.format("현재 온도는 %f 이며, 습도는 %f, 기압은 %f 입니다.",  temperature, humidity, pressure));
	}
}
