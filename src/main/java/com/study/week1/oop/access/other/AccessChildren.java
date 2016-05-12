package com.study.week1.oop.access.other;

import com.study.week1.oop.access.AccessParent;

public class AccessChildren extends AccessParent {
	private String name = "AccessChilren";

	// @Override
	public String getName() {
		return this.name;
	}
	
	// private 은 외부에서 접근할 수 없다.
	public String getNameByPrivate() {
//		return accessParent.getName();		
		return null;
	}
	
	// default 는 상속으로 접근할 수 없다.
	public String getNameByDefault() {
//		return super.getNameByDefault();
		return null;
	}
	
	// protected 는 같은 상속으로 접근할 수 있다.
	@Override
	public String getNameByProtected() {
		return "Child : " + super.getNameByProtected();
	}

	@Override
	public String getNameByPublic() {
		return "Child : " + super.getNameByPublic();
	}


	public String onlyChildren() {
		return "onlyChildren";
	}

	
}
