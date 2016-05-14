package com.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.domain.Board;
import com.study.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	List<Post> findByBoard(Board board);
}
