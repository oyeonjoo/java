package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); //��� ����
		System.out.println(score); //���� ����
		System.out.println(100 + 1);
		System.out.println(Math.random()); // ()�ȿ� method call�� ���� �� ����.
		
		System.out.print(200);
		System.out.print(300); // println�� �� parameter�� ���ο� �ٿ� ���, print�� ������ ���.
		System.out.print("\n"); // \n�� �ϳ��� ����
		System.out.print(400);
		
		System.out.printf("%b %c %d %f %s\n" , true, 'a', 10 , 1.15, "hello"); //parameter 2�� ��� ù��° parameter�� string���� ����. ��¾���� 
						//boolean char ���� �Ǽ� ���ڿ� �ٹٲ�
		// [����] �� ��¹����� �����ڷ� /�� ����ϼ���. => "%b / %c / �� Ʋ�� �� ������/�Ӹ� �ƴ϶� ��ĭ�� ���ԵǾ� ����.
		System.out.printf("%b/%c/%d/%f/%s\n" , true, 'a', 10 , 1.15, "hello");
		
		//5�ڸ� ���� �����ؼ� ��Ÿ����
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.15, "hello"); //���� ����� ������ ���� ������ ���������� ���Ѵ�.
		 				// �����̽� ���� �ִ��� ������ ������ �� || ������ �ȿ� �־��
		
		String name = "���Ѽ�";
		int age = 22;
		System.out.printf("%s %d", name, age); 
		System.out.printf("\n%s�� %d���Դϴ�.", name, age);
		System.out.println();
		System.out.println(name + "�� " + age + "���Դϴ�.");
	}
}

