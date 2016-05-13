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
        // TODO Auto-generated method stub
        System.out.println("============Riot 신문 입니다.");
        System.out.println(String.format("지금 기온은 %f 이고, 습도는  %f 에요. 기압은 몰라요.", temperature, humidity));
    }
}
