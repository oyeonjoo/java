package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int tot = 0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C'; 
		
		System.out.printf("\n����: %d\n���: %.1f\n����: %c", tot, avg, grade); //.nf=> �Ҽ������� n��°���� ���.
	}
}
/*
����, ����, ���� ������ �Է¹޴´�.
����, ���, ������ ����Ѵ�.
��������� �Ҽ������� 1�ڸ������� ����Ѵ�.(�Ǽ��� ���� �� �ִ� ��)��¸�!!!!!!!!!!! �� ��ü�� ��

90 <= mean <= 100: A
80 <= MEAN < 90: B
	 mean <80 : C
----
����: 95
����: 100
����: 100

����: 295
���: 98.3
����: A
*/