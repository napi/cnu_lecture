package com.study.repository.mybatis;

import com.study.domain.cnu.CnuPost;
import com.study.domain.jpa.JpaBoard;

import java.util.List;

public interface CnuRepository {
	List<JpaBoard> selectJpaBoardList();

	int insertCnuBoard(Object obj);

	List<CnuPost> selectCnuPostList();
	Object selectCnuBoard(long postId);

	int updateCnuBoard(Object obj);

	int deleteCnuBoard(long postId, String password);
}
