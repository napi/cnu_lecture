package com.study.week1.quiz;

public class AutoBoxing {
	public char[] getAutoBoxing() {
		int idx = 0;
		char[] chars = new char[3];
		
		chars[idx++] = '0';
		chars[idx++] = 65;
		chars[idx++] = 'a' + 1;
		
		return chars;
	}
}