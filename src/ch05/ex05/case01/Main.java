package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2); //add�޼ҵ� ���ϴ� �޼ҵ� = main()
		result = calculator.add(1, 2, 3);									//�ٵ�κ��� �Ⱥ���(return a + b;)
		System.out.println(result);
	}
}
