package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift + O �� scanner�� �����ϴ� ��Ű���� import�Ѵ�.		
		/*
		sc.nextLine(); nextLine()�� StringŸ��
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		[����] <�Էµ�����>�� �Է��߽��ϴ�. �� Ȯ�θ޼����� ����Ѵ�. (Hello�� �Է��߽��ϴ�.) "hello"��� ���� ������ ������ �ؾ��Ѵ�. 
		String inVal = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal);
		
		[����3] ���ڿ� �Է� X -> ��ġ��
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.println(i + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i2 = sc.nextInt();
		sc.nextLine();
		System.out.println(i2 + "�� �Է��߽��ϴ�.");
 		
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal);
		*/

		System.out.print("���ڸ� �Է��ϼ���.\n>");
		char c = sc.nextLine().charAt(3); // charAt(0) �� ���ڸ� �Է��ϰ� ���� �� ���� �����Ѵ�
		System.out.println(c);
	}
}
