package com.study.week1.oop.access;

public class AccessParent {
	private String name = "AccessParent";
	  
	private String getName() {
		return this.name;
	}
	
	String getNameByDefault() {
		return this.name;
	}
	
	protected String getNameByProtected() {
		return this.name;
	}
	
	public String getNameByPublic() {
		return this.name;
	}

}
