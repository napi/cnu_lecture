package com.study.exception;

public class BoardNotFoundException extends ResourceNotFoundException {
	private final String boardName;
	
	public BoardNotFoundException(String boardName) {
		this.boardName = boardName;
	}
	
	public String getBoardName() {
		return this.boardName;
	}
	
	@Override
	public String getError() {
		return "Board : " + super.getError();
	}
	
	@Override
	public Object[] getArgs() {
		return new Object[]{boardName};
	}
}
