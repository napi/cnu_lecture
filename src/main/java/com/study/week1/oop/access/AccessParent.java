package com.study.week1.oop.access;

public class AccessParent {
	private String name = "AccessParent";
	  
	private String getName() {
		return this.name;
	}
	
	String getNameByDefault() {
		return this.name + "_Default";
	}
	
	protected String getNameByProtected() {
		return this.name + "_Protected";
	}
	
	public String getNameByPublic() {
		return this.name + "_Public";
	}
	
	

}
