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
//	== : 참조 주소비교
//	equals : 값이 같으면 같다

//	p1==p2 HEAP 메모리상에 주소가 다름
//	p2==p3 			""
//	p3==p4 			""
//	p4==p1	같은주소를 참조하고있다
//	p1 equals 값은 같지만 동등성을 비교하는 메서드가 없어서 false
//	p4 equals 값도같고 주소도 같다

