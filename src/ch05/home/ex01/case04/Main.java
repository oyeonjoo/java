package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String name = ""; 
		int age = 0;
		LocalDate regDate = null; //�����Ⱚ���ֱ� ���� �⺻�� �ʱ�ȭ�ؾ���
		
		System.out.print("�̸�: ");
		name = sc.nextLine();
		System.out.print("����: ");
		age = sc.nextInt();
		regDate = LocalDate.now();
		
		User user= new User();
		user.setName(name);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n�̸�: %s\n����: %d\n������: %s", 
				user.getName(), user.getAge(), user.getRegDate());
		/*
		Scanner sc = new Scanner(System.in);
		User user = new User();
		
		System.out.print("�̸�: ");
		user.setName(sc.nextLine());
		System.out.print("����: ");
		user.setAge(sc.nextInt());
		user.setSignDay(LocalDate.now());
		
		System.out.printf("\n�̸�: %s\n����: %d\n������: %s", user.getName(), user.getAge(), user.getSignDay());
		*/
	}
}
/*
����] ����ڸ� �����϶�.
������� �̸�, ���̸� ���� �Է� �޴´�.(������ �Է�)
�������� ���� ��¥�� �ڵ� �Է� �޴´�.
----

�̸�: gambit(�Է�)
����: 25(�Է�)

�̸�: gambit(�Է�)
����: 25(�Է�)
������: 2022-06-22
*/