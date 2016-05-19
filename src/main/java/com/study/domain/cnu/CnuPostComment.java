package com.study.domain.cnu;

import java.util.Date;

public class CnuPostComment {
		private int commnetId;
	 	private int postId;
	    private String author;
	    private String password;
	    private String comment;
	    private Date createTime;
	    private boolean isDel;

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

		public int getCommnetId() {
			return commnetId;
		}

		public void setCommnetId(int commnetId) {
			this.commnetId = commnetId;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

}
