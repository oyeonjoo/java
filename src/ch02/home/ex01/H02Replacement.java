package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("a�� ���� �Է��ϼ���. a: ");
		int a = sc.nextInt();
		System.out.print("b�� ���� �Է��ϼ���. b: ");
		int b = sc.nextInt();
		System.out.println("a�� b�� ��ü�մϴ�.");
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.printf("a: %d, b: %d\n", a, b);
		System.out.println("��ü�� �������ϴ�.");
		*/
		
		System.out.print("a: "); //presentation logic ȭ�� ����
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a : %d, b : %d\n", a, b);
		
		System.out.println("=> a, b ���� ��ü�մϴ�.");
		int temp = 0; // business logic
		temp = a; // backup
		a = b;
		b = temp;
		System.out.printf("=> a : %d, b : %d\n", a, b);
		System.out.println("��ü�� �������ϴ�.");
	}
}
/*
[����] a, b ������ ���� ��ü�϶�.
	a�� b���� ���Ƿ� �Է¹޴´�.
	��ü ����� ����Ѵ�.
*/