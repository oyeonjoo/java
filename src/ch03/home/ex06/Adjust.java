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
		double d = 0.0;
		
		System.out.print("x: ");
		d = sc.nextDouble();
		System.out.println(d - d % 1.0);
		 */
	}
}
/*
%�����ڸ� �̿��ؼ�, �Ǽ����� �Ҽ��� ���ϸ� ����ó���϶�.
(casting), Math API��� �� �Ѵ�.
�Ǽ� ���� sc.nextDouble()�� �Է��Ѵ�.
------
x: 3.1492
3.0
*/