package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good");
		//(a > 0 && a < 4)���� ���� �ڵ���
		
		//[����1] b����, 'a'�ʰ� 'c' �̸� ������ ���ϸ�, good�� ���϶�.
		char b = 'b';
		if('a' < b && b < 'c') 
			System.out.println("good"); 
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0) // �պκ��� true�̱� ������ �޺κ��� ����X. ���� �ڵ�� �ƴ�.
			System.out.printf("x: %d, y: %d\n", x, y);
		
		//���� s���� he, HE, He, hE�߿� �ϳ���, he�� ���϶�.
		String s = "HE";
		if(s.equals("he") || s.equals("HE") || s.equals("He") ||s.equals("hE")) 
			System.out.println("he");
		
		s = ""; //���� ���� ���
		if(s.equals("")) System.out.println("���� ����.");
		
		//[����] ���� ������, ���� �ִ�.�� ���϶�.
		s = "hello";
		if(!s.equals(""))System.out.println("���� �ִ�."); //������������ "!"���̱�
		
		boolean power = false; //���___? �� �������� ����
		if(!power) System.out.println("������ �Ѵ�."); 
	}
}