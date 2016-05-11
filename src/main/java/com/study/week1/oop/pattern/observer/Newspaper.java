package com.study.week1.oop.pattern.observer;

import java.util.HashMap;
import java.util.Map;

public class Newspaper implements Observer{
	private Map<NewsType, String> newsMap;
	
	public Newspaper() {
		newsMap = new HashMap<>();
	}
	
	/**
	 * 뉴스 기사를 쓰기위한 접근자가 public 이다. 
	 * 아무나 막 기사를 쓸 수 있는 것을 막기 위해 private 으로 바꿔야 한다.
	 * @param newsType
	 * @param report
	 */
	public void setNews(NewsType newsType, String report) {
		newsMap.put(newsType, report);
	}
	
	public String getNews(NewsType newsType) {
		return newsMap.get(newsType);
	}
	
	public enum NewsType {
		WEATHER,
		SPORTS,
		ECONOMY
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println(String.format("현재 온도는 %f 이며, 습도는 %f, 기압은 %f 입니다.",  temperature, humidity, pressure));	
	}
}
