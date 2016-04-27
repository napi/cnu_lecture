package com.study.week1.oop.access;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.study.week1.oop.access.other.AccessChildrenOther;

public class AccessParentTest {
	private AccessParent accessParent;
	private AccessChildren accessChildren;
	private AccessChildrenOther accessChildrenOther;
	
	
	@Before
	public void init() {
		accessParent = new AccessParent();
		accessChildren = new AccessChildren();
		accessChildrenOther = new AccessChildrenOther();
	}
	
	@Test
	public void parent() {
		accessParent.getNameByPublic();
		accessParent.getNameByProtected();
		accessParent.getNameByDefault();
//		accessParent.getName();	 This is compile error.
	}

	@Test
	public void children() {
		accessChildren.getNameByPublic();
		accessChildren.getNameByProtected();
		accessChildren.getNameByDefault();
//		accessParent.getName();	 This is compile error.
	}

	@Test
	public void childrenOther() {
		accessChildrenOther.getNameByPublic();
		accessChildrenOther.getNameByProtected();
//		accessChildrenOther.getNameByDefault(); This is compile error.
//		accessParent.getName();	 This is compile error.
	}

}
