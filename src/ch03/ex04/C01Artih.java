package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b;
		byte c = (byte)(a + b);//[����2]casting�� �Ҵ翬���� ������ ������ ������ �ذ��϶�.
		System.out.println(c);
		
		//c = c + 1;
		c++;
		System.out.println(c);
		
		double d = a / b;
		System.out.println(d); // =>������ ���� : overflow
		
		//[����]���� �ذ�
		//d = (double)a / (double)b; Me
		d = (double)a / b;
		//d = 1.0 * a / b; ���2
		//d = a / b * 1.0; ����. �̰�X
		System.out.println(d);
	}
}
