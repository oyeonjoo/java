package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b; casting�� �Ҵ翬���� ������ ������ ������ �ذ��϶�.
		byte c = (byte)(a + b); // ����������� ���� ���� int�̴�
		System.out.println(c);
		
		//c = c + 1;
		c++;
		System.out.println(c);
		
		double d = a / b; // ����ϴ� �������� int�� �ٲ��. �Ҵ翬���ڰ� ����Ǳ� ���� overflow
		System.out.println(d); // => ������ ���� : overflow
		
		//[����]���� �ذ�
		d = (double) a / b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		// �Ѱ����� double�� �ٲ��ָ� ���� �� double�� casting �ȴ�.
		d = (double)(a / b); // �켱���� ������ a/b�� ���� ���ȴ�. int���� ���ȴ�
		System.out.println(d);
		d = a / b * 1.0; // ����. �̰�X
		System.out.println(d);
	}
}
