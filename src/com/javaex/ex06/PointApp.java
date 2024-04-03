package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}

}

//	p1==p2 HEAP 메모리상에 주소가 다름
//	p2==p3 
//	p3==p4 
//	p4==p1	p4는 p1을 복제했다
//	p1 equals 값은 같지만 참조하는 주소가 다르다
//	p4 equals 값도같고 주소도 같다

