package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
	int x = 10; //decimal 10����
	System.out.println(Integer.toBinaryString(x)); // 2������ ��ȯ���ش�, (����)Ÿ���� String
	
	x = 012; // octal 8����, �����Ϸ����� 8�������� �˸��� ���� ���� �Ǿտ� 0�� �Է��Ѵ�. ex) 012: 8����, 12: 10����
	System.out.println(Integer.toBinaryString(x));
	
	x = 0xA; // hexa 16���� 
	System.out.println(Integer.toBinaryString(x));
	
	x = 0b1010; // binary 2����
	System.out.println(Integer.toBinaryString(x));
	
	x = 1_234_567; // �ڸ��� ���п����� ,�� �ƴ� _�� ����Ѵ�. ���ͷ����� ��밡���ϴ�.
	System.out.println(x + 1);
	
	double y = 1e1; // 10�� 1����(1 * 10�� 1��) , ������ ��Ÿ���� double���
	System.out.println(y);
	}
}
