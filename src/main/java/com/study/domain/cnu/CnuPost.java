package com.study.domain.cnu;

import java.util.Date;
import java.util.List;

/**
 * Created by rokim on 2016. 5. 16..
 */
public class CnuPost {
    private int postId;
    private String author;
    private String password;
    private String title;
    private String content;
    private Date createTime;
    private int viewCount;
    private boolean isDel;
    private List<CnuComment> cnuCommentList;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isDel() {
        return isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public void increaseViewCount(){
		this.viewCount++;
	}

    public List<CnuComment> getCnuCommentList() {
        return cnuCommentList;
    }

    public void setCnuCommentList(List<CnuComment> cnuCommentList) {
        this.cnuCommentList = cnuCommentList;
    }
}
