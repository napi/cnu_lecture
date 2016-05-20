package com.study.domain.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JpaBoard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Date createAt;
	
	public JpaBoard() {
		
	}
	
	public JpaBoard(String name) {
		this.name = name;
		this.createAt = new Date();
	}
	
	public JpaPost write(String author, String title, String content) {
		return new JpaPost(this, author, title, content);
	}	
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
}
