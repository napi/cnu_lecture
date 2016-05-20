package com.study.repository.mybatis;

import com.study.domain.cnu.CnuComment;
import com.study.domain.cnu.CnuPost;
import com.study.domain.jpa.JpaBoard;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CnuRepository {
	List<CnuPost> selectCnuPostList();
	List<CnuComment> selectCnuCommentList(int postId);



	int insertCnuPost(CnuPost obj);


	CnuPost selectCnuBoard(int postId);
	int updateCnuBoard(CnuPost obj);
	int deleteCnuBoard(int postId, String password);
}
