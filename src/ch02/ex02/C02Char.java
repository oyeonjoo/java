package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A'; // charŸ���� �����. VM�� ����A�� �ƴ� �����ڵ� ���ڸ� c������ ����.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 65; // A�� ���ڰ��� 65.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041; // 0041�� �������� 10������ �Ǵ��ϱ⶧���� �տ� 16�������� �˸��� ���� 0x�� �־����. 
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c= '\u0041'; // ��������u(Ư������)�� �����ڵ尪		
		System.out.printf("%c, %s", c, Integer.toBinaryString(c));

	}
} 