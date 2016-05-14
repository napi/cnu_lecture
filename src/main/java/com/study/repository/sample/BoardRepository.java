package com.study.repository.sample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.domain.sample.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	Board findByName(String name);
}
