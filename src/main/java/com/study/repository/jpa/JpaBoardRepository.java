package com.study.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.domain.jpa.JpaBoard;

public interface JpaBoardRepository extends JpaRepository<JpaBoard, Long> {
	JpaBoard findByName(String name);
}
