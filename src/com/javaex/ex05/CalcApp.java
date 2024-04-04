package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// 스캐너 열기
		// 루프
		// 한 라인을 입력

		// 라인이 /q면 종료
		// 라인이 q가 아니면 분할(split) : 1+2 > ["1","+","2"]
		// operator 기준으로 사칙연산 커맨드 수행
		// 스캐너 종료

		Scanner sc = new Scanner(System.in);
		int result = 0;

		while (true) {
			System.out.print(">>");
			String strLine = sc.nextLine();

			if (strLine.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			String[] data = strLine.split(" ");
				int leftnum = Integer.parseInt(data[0]);
			String operator = data[1];
				int rightnum = Integer.parseInt(data[2]);

			switch (operator) {
			case "+":
				Add add = new Add();
				add.setValue(leftnum, rightnum);
				result = add.calculate();
				System.out.println(">>" + result);
				break;

			case "-":
				Sub sub = new Sub();
				sub.setValue(leftnum, rightnum);
				result = sub.calculate();
				System.out.println(">>" + result);
				break;
				
			case "*":
				Mul mul = new Mul();
				mul.setValue(leftnum, rightnum);
				result = mul.calculate();
				System.out.println(">>" + result);
				break;
				
			case "/":
				Div div = new Div();
				div.setValue(leftnum, rightnum);
				result = div.calculate();
				System.out.println(">>" + result);
				break;

			default:
				System.out.println("알수없는 연산자");
				break;
			}

		}

		sc.close();

	}
}
