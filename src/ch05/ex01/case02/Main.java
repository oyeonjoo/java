package ch05.ex01.case02;

public class Main {
	public static void main(String[] arsg) {
		//�ѻ���� ���������� �ΰ��� �ڵ�.. �ڵ�� �ѻ���� ������ X �Ӹ��Ӱ� �ڵ尡 �ٸ�
		String name = "���Ѽ�";
		int age = 35;
		System.out.printf("%s�� %d���Դϴ�.\n", name, age); //�޽����� �ѻ������ ǥ��
		
		User user = new User();
		user.name = "���Ѽ�";
		user.age = 35;
		System.out.printf("%s�� %d���Դϴ�.", user.name, user.age);
	}
}
