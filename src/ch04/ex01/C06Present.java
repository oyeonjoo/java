package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String prize = "";
		
		System.out.print("1.�����, 2.��Ź��\n> "); //������� �ڵ� ���� 1��, ��Ź���� �ڵ尪�� 2��
		choice = sc.nextInt();
		
		if(choice == 1) prize = "�����";
		else if(choice == 2) prize = "��Ź��";
		else prize = "ȭ����"; //����ó�� : �ٸ� �޴��� �����ϸ� ȭ������ �ش�.
		
		System.out.println(prize);
	}
}
