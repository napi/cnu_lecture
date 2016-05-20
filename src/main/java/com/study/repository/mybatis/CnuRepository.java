package com.study.repository.mybatis;

import com.study.domain.cnu.CnuPost;
import com.study.domain.jpa.JpaBoard;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CnuRepository {
	List<CnuPost> selectCnuPostList();
	int insertCnuPost(CnuPost obj);

	CnuPost selectCnuPost(int postId);
	int updateCnuPost(CnuPost obj);
	int deleteCnuPost(int postId, String password);
}
