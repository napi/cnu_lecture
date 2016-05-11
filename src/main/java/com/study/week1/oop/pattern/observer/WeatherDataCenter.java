package com.study.week1.oop.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherDataCenter implements Subject{
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;
 
    public WeatherDataCenter() {
        this.observerList = new ArrayList<Observer>();
    }
 
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }
 
    @Override
    public void removeObserver(Observer o) {
        if (observerList.indexOf(o) >= 0) {
        	observerList.remove(o);
        }
    }
    // 각 observe에게 뿌려주는 역할을 함.
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
        	observer.update(temperature, humidity, pressure);
        }
    }
     
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
         
        measurementsChanged();
    }
     
    public void measurementsChanged() {
    	notifyObservers();
    }
 
}
