package com.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	Board findByName(String name);
}
