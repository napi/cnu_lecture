package com.study.service.cnu;

import com.study.domain.cnu.CnuPost;
import com.study.repository.mybatis.CnuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rokim on 2016. 5. 23..
 */
@Service
public class CnuService {
    @Autowired private CnuRepository cnuRepository;

    public List<CnuPost> getCnuPostList() {
        List<CnuPost> cnuPostList = cnuRepository.selectCnuPostList();
        for (CnuPost cnuPost : cnuPostList) {
            cnuPost.setCnuCommentList(cnuRepository.selectCnuCommentList(cnuPost.getPostId()));
        }

        return cnuPostList;
    }
}
