package ch03.ex04;

public class C02DecimaPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0; //�Ҽ������� 1�ڸ�.  pi*10 -> int ->  / 10.0
		System.out.println(shortPi);
		
		//[����]3.141
		shortPi = (int)(pi * 1000) / 1000.0; //0�� ������ �Ҽ��������� �ڸ���
		System.out.println(shortPi);
		
		//[����]3.142
		shortPi = Math.round(pi*1000) / 1000.0;
		System.out.println(shortPi);
	}
}
