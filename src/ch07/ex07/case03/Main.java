package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		//����] calculator�� lamda���� �Ҵ��϶�.
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		//�ڵ� �� �����ϰ� , ���� ���� �̹�� ����!
		calculator = (a, b)-> a + b; //���ϻ���, �Ķ���� ��¼���� ����
		
		System.out.println(calculator.calc(1, 2));
	}
}
