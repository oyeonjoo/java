package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("�޽���: ");
		paper.setMsg(sc.nextLine());
		System.out.print("�ۼ��ڸ�: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s", paper.getMsg() ,paper.getWriterName());
	}
}
/* 
����] ���̿� �޼����� �ۼ��ڸ��� ����Ѵ�.
---
�޼���: hello
�ۼ��ڸ�: terry

hello from terry.

//�ۼ����ϰ� �ۼ��ڸ� ���� => �ۼ���:��ü, �ۼ��ڸ�:�Ӽ�
*/