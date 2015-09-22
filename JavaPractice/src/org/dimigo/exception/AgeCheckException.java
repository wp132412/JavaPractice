package org.dimigo.exception;

public class AgeCheckException extends Exception { 
	public AgeCheckException() {
	}
	
	public AgeCheckException(Movie m) {
		super(m.getTitle() + "은/는 " + m.getLimitAge() + "세 이상 관람가입니다.");
	}
}
