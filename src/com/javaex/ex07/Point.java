package com.javaex.ex07;

//	요청사항 : 필드 x가 같으면 동등객체로 취급
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals(Point p) {
		if (x==p.x) {
			return true;
		}else {
		return false;
		}
	}
	
}

//	강사님 작성코드
//	@Override
//	public boolean equals(Object obj) {
//	>	매개변수(비교대상) > Point로 캐스팅
//		if(obj instanaceof Point) {
//			Pont other = (Point})obj;
//			return this.x. == other.x;
//		}
//		return supper.equals(obj);