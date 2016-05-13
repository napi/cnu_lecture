package com.study.repository.mybatis;

import java.util.List;

import com.study.domain.Board;

public interface CnuRepository {
	List<Board> selectBoardList();
}
