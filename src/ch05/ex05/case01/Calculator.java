package ch05.ex05.case01;

public class Calculator {
	public int add(int a,int b) { //transparent: ?????
		return a + b;				//�տ� int�� add��������, �ȿ� int�� add����
	}
	
	public int add(int a, int b, int c) { //�����ε� : �ϳ��� Ŭ������ �̸��� ���� �Ķ���Ͱ� �ٸ� �޼ҵ带 �ΰ� �̻� �����ߴ�.
		return a + b + c;
	}
}
