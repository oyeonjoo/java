package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0; //ù��° �Է°�
		int b = 0; //�ι�° �Է°�
		
		System.out.print("a: "); 
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		/*
		int a = 0;
		int b = 0;
		int sum = 0;
		
		System.out.print("a: "); a = sc.nextInt();
		System.out.print("b: "); b  = sc.nextInt();
		sum = a + b;
		
		System.out.printf("%d + %d = %d", a, b, sum);
		*/
	}
}
/*
 �� �ڿ����� �Է¹޾�, �� �հ踦 ����϶�.
 -----
 a: 1
 b: 2
 1 + 2 = 3
*/