package ch05.ex07.case01;

public class Stack {
	public static void first() { //first�� ���ÿ� �����.
		int a = 0; //first���� a������ ���ÿ� ���δ�.
		Stack.second(); //second�� static�޼ҵ�ϱ� Ŭ�����̸� Stack.�޼ҵ�� 
	}					//Stack�� a ���� �ΰ�����............... 	
	
	public static void second() {
		int a = 0; //�޼ҵ庰�� �������� ������. �ٸ� �޼ҵ忡 ���� ���� ��������
	}
	
}
