package com.javaex.ex01;

import java.io.IOException;

public class LastNumberApp {

	public static void main(String[] args) {

		// 수정하지 마세요
		lastValue();
	}


	//런타임시 오류발생
	public static void lastValue() {

		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result;
		
		//아래부분을 try~catch문을 사용하여 수정하세요
//		result = intArray[3];
//		System.out.println(result);
		try {
			System.out.println(intArray[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 범위를 벗어났습니다");
		}			
	}
	

}