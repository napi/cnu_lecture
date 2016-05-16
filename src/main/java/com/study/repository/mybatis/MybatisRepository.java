package com.study.repository.mybatis;

import java.util.List;

import com.study.domain.jpa.JpaBoard;

public interface MybatisRepository {
	List<JpaBoard> selectJpaBoardList();
}
