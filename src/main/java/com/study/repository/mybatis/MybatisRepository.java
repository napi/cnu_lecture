package com.study.repository.mybatis;

import java.util.List;

import com.study.domain.jpa.JpaBoard;

public interface MybatisRepository {
	List<JpaBoard> selectJpaBoardList();

	int insertCnuBoard(Object obj);

	List<Object> selectCnuBoardList();
	Object selectCnuBoard(long postId);

	int updateCnuBoard(Object obj);

	int deleteCnuBoard(long postId, String password);
}
