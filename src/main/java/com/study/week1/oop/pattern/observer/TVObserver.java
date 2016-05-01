package com.study.week1.oop.pattern.observer;

public class TVObserver implements Observer {
	private int channel;
	

	public void display(String s) {
		System.out.println("==============TV 화면이에요==============");
		System.out.println("==============    " + s + "    ==============");
		System.out.println("==============TV 화면이에요==============");
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		display(String.format("현재 온도는 %f 이며, 습도는 %f, 기압은 %f 입니다.",  temperature, humidity, pressure));
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
}
