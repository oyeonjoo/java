package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; Ÿ�� mismatch byte - int
		byte b = 127; // System.out.println(Byte.MAX_VALUE); byte�� �ִ������� 127�̴�.
		//b = b + 1; �����Ͽ���
		
		//(�ϳ��� ������) ++�ܻܿ�����, b������ �����͸� �о 1����/ �б� ���� ���� (1��������)
		b++; // b�ǰ��� �а� 1�������� �ٽ� b�� write�Ѵ�. overflow������ -128�� �ȴ�.
		b++; // -128 + 1
		System.out.println(b);
	}
}
