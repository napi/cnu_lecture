package com.study.repository.mybatis;

import com.study.domain.cnu.CnuPost;
import com.study.domain.jpa.JpaBoard;

import java.util.List;

public interface CnuRepository {
	List<CnuPost> selectCnuPostList();

	int insertCnuBoard(CnuPost obj);
	CnuPost selectCnuBoard(int postId);
	int updateCnuBoard(CnuPost obj);
	int deleteCnuBoard(int postId, String password);
}
