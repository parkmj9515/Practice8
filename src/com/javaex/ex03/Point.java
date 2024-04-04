package com.javaex.ex03;

import java.util.Arrays;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString()을 작성 하세요
	@Override
	public String toString() {	
		//	출력 문자열 형식 반환
		return " 포인트(x:" + x +", y:"+ y +")";
		//강사님 코드
		// reture String.format("[포인트] x=%d, y=%d입니다%n",x,y);
	}
}

//	%s 문자열
//	%d	정수
//	%f	실수
//	%n	개행
