package com.study.week1.oop.pattern.observer;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.study.week1.oop.pattern.observer.Newspaper.NewsType;

public class WeatherDataCenterTest {
	@Test
	public void testObserver() throws Exception {
		WeatherDataCenter weatherData = new WeatherDataCenter();
		
		RadioObserver radioObserver = new RadioObserver();
		TVObserver tvObserver = new TVObserver();
		Newspaper newspaper = new Newspaper();

		weatherData.registerObserver(radioObserver);
		weatherData.registerObserver(tvObserver);
		weatherData.registerObserver(newspaper);
		
		weatherData.setMeasurements(25f, 0.4f, 1.1f);
		
		/**
		 *  assert 구문이 없는, console out 으로만 확인이 가능한 잘못된 형태의 테스트 코드이다.
		 */
	}
	
	@Test
	public void testNewspaper() {
		/**
		 * TODO
		 * 
		 * 신문사에 다니는 당신은 기상정보를 수동으로 입력하지 않고, 기상센터에서 데이터를 Push 받고 싶다.
		 * 기상센터에 연락해보니 Observer 인터페이스를 알려준 후 알아서 하라는 답변을 받았다.
		 * 
		 * 알아서 해보자.
		 * 
		 */
		Newspaper newspaper = new Newspaper();
		
		
		/**
		 * Old 한 방식. 매번 반복적인 날씨 기사를 쓰는 것은 고통이다. 바꾸자!
		 */
		String weatherNews = "온도:25, 습도:30%, 기압:1.2";
		newspaper.setNews(NewsType.WEATHER, weatherNews);
		
		
		// 기상센터에서 자동으로 해주는 영역
		WeatherDataCenter weatherData = new WeatherDataCenter();
		weatherData.setMeasurements(25f, 0.3f, 1.2f);
		// 기상센터에서 자동으로 해주는 // 영역
		
		
		assertThat(newspaper.getNews(NewsType.WEATHER), is("온도:25, 습도:30%, 기압:1.2"));
	}
}
