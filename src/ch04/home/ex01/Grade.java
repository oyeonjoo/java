package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0; //10���ڸ� ���� �ɰ���
		int oneDigit = 0; //1���ڸ� ���� �ɰ���
		String grade = "";
		
		System.out.print("����: ");
		score = sc.nextInt();
		
		tenDigit = score / 10; //�����ɰ��� 10���� ���� �� = �����ڸ�
		oneDigit = score % 10; //�����ɰ��� 10���� ���� ������ = �����ڸ�
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
		else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}

		System.out.println(grade);
	}
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		
		int score = 0;
		String grade = "";
		score = sc.nextInt();
		
		if(score >= 98) grade = "A+";
		else if(score >= 94) grade = "A";
		else if(score >= 90) grade = "A-";
		else if(score >= 88) grade = "B+";
		else if(score >= 84) grade = "B";
		else if(score >= 80) grade = "-B";
		else grade = "C";
		
		System.out.println(grade);
		*/
}

		/*
		���� �������� ������ �ο��϶�.
		98 �̻� A+
		94 �̻� A
		90 �̻� A-
		88 �̻� B+
		84 �̻� B
		80 �̻� B-
		80 �̸� C
		----
		
		����: 100 (�Է�)
		A+
		*/