package com.study.repository.sample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.domain.sample.Board;
import com.study.domain.sample.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	List<Post> findByBoard(Board board);
}
