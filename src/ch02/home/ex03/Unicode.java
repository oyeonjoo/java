package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		char ch = sc.nextLine().charAt(0); // *.charAt(n)�� StringŸ�� n��°���ڸ� CharŸ������ ��ȯ.*
		
		int unicode = ch;
		System.out.printf("%c�� unicode�� %d", ch, unicode);
	}
}
/*
����] �Է��� ������ unicode�� ����϶�. => charŸ��
-----

����: A(�Է�)
A�� unicode�� 65�Դϴ�.
*/