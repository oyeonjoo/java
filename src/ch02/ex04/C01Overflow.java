package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // byte -> int promotion, casting
		i = (int)b; // casting, promotion 
		System.out.println(i); // promotion(ū ũ���� Ÿ�� �� ���� ũ���� Ÿ��) �Ǵ� �Ŵ� Overflow�߻� x, �ڵ�Ÿ�Ժ�ȯ
		
		// overflow�߻��ϴ� ���
		int i2 = 300;
		byte b2 = (byte)i2; // i2�� byte ĳ���ÿ����� ��� ĳ���ø��ϰ��� �����ؼ� b2�� ����. casting(ū ũ���� Ÿ�� �� ���� ũ���� Ÿ��) ����Ÿ�Ժ�ȯ
		System.out.println(b2); // 300 > 44 ������ ���� : overflow
	}
}
