package ch05.ex08.case03;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus();
		System.out.println(citrus.getName());
		//�����ڿ� "������"�� ������ ����ϸ� null����.(����) 
		//����: new�ϸ� ��ü�� ������(��ü�ι�����). 1����ü�� null, 2����ü�� ������. ���⼭ ���°�ü�� 1����ü
		
		Citrus citrus1 = new Citrus();
		Citrus citrus2 = new Citrus("������");
		//System.out.println(citrus.getName());
		
		System.out.println(citrus1.getName());
		System.out.println(citrus2.getName());
		
	}
}
