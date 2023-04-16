package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double result = 0;
		
		System.out.print("x: ");
		x = sc.nextDouble();
		
		result = x - x % 1;
		System.out.println(result);
		
		/*
		% 연산자를 이용해서, 실수값의 소수점 이하를 내림처리하라.
		(casting), Math API사용 안 한다.
		실수 값은 sc.nextDouble()로 입력한다.
		------------------------------------------
		예시) x: 3.1492
			출력값: 3.0
		*/
	}
}
