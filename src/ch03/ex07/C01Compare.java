package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B'; //TRUE, b�������� true�� ����
		b = '0' == 0; //False, ����'0'�� ����0
		b = 'A' != 65; //False
		
		b = 10.0 ==10.0f; //TRUE, double 10.0�� float 10.0
		b = 0.1 == 0.1f; //0.1���� �Ҽ��� ù°�ڸ� ���� �ڸ��� �þ�鼭 �ٸ� ���� ����.
		b = (float)0.1 == 0.1f;
		System.out.println(b);
	}
}