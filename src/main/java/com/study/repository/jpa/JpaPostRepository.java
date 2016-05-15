package com.study.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.domain.jpa.JpaBoard;
import com.study.domain.jpa.JpaPost;

public interface JpaPostRepository extends JpaRepository<JpaPost, Long>{
	List<JpaPost> findByJpaBoard(JpaBoard jpaBoard);
}
