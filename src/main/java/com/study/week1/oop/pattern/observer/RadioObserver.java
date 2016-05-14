package com.study.week1.oop.pattern.observer;

public class RadioObserver implements Observer {
	private int frequency;
	
	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public void onAir(String s) {
		System.out.println("안녕하세요. Riot 라디오 입니다.");
		System.out.println(s);
		System.out.println("감사합니다.");
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		onAir(String.format("현재 온도는 %f 이며, 습도는 %f, 기압은 %f 입니다.",  temperature, humidity, pressure));
	}
}
