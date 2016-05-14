package com.study.repository.mybatis;

import java.util.List;

import com.study.domain.sample.Board;

public interface CnuRepository {
	List<Board> selectBoardList();
}
