package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;//�Է°��� ��ȿ���� ��Ÿ��. �Է°� ��->true
		String errMsg = "ERROR] ���ڸ� �ڿ����� �Է��ϼ���.";
		
		do {
			System.out.print("�Է�: ");
			input = sc.nextLine();
			if(input.length() == 1 && '0' < input.charAt(0) && input.charAt(0) <= '9')
				isGood = true;
			else System.out.println(errMsg);
		} while(!isGood);//�Է°��� �����̸� �ݺ��ϰڴ�.
		
		System.out.println("��");
	}
}
/*
����] ���ڸ� �ڿ����� �Է¹޴´�.
10�̻��� �ڿ���, �Ǵ� ���ڰ� �ԷµǸ� ����ó���Ѵ�. �ݺ�����
�����ε� ������ô �����ε� ������ô.
*/