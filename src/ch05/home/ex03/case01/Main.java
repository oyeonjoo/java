package ch05.home.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat(); //new�� �Ѹ����� �ֿ����ϴٸ� ǥ��.
		
		cat.setColor("����");
		cat.setName("���ڹ�"); //�̸��� ��������ϴٸ� setName���� ǥ��
		
		System.out.printf("%s ����� �Ѹ����� �ֿ����ϴ�.\n%s��� �̸��� ��������ϴ�.",
				cat.getColor(), cat.getName());
	}
}
/*
���� ����� �Ѹ����� �ֿ����ϴ�.
���ڹ̶�� �̸��� ��������ϴ�.
*/