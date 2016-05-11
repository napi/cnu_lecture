package com.study.week1.oop.access;

public class Another {
	private String name = "Another";
	private AccessParent accessParent;

	public Another(AccessParent accessParent) {
		this.accessParent = accessParent;
	}
	
	public String getName() {
		return this.name;
	}
	
	// private 은 외부에서 접근할 수 없다.
	public String getAccessParentByPrivate() {
//		return accessParent.getName();		
		return null;
	}
	
	// default 는 같은 패키지에서 접근할 수 있다.
	public String getAccessParentNameByDefault() {
		return "Another : " + accessParent.getNameByDefault();
	}

	// protected 는 같은 패키지에서 접근할 수 있다.
	public String getAccessParentNameByProtected() {
		return "Another : " + accessParent.getNameByProtected();
	}

	public String getAccessParentNameByPublic() {
		return "Another : " + accessParent.getNameByPublic();
	}
}
