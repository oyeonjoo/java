package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		//animal�� �������̽� => new Animal ����, 
		//Animal �迭��ü ����� 
		Animal[] animals = new Animal[3]; //, �ִϸ� Ÿ�� ��ü�� ����� �ȸ��� �ִϸ� Ÿ�Կ� �� ��ü�� �����
		
		animals[0] = new Cat("�����"); //cat�� animal�� ���θ�ǵż� �Ҵ��
		animals[1] = new Dog("�п���"); //dog�� animal�� ���θ�ǵż� �Ҵ��
		animals[2] = new Dog("��ŭ��");
		
		for(Animal animal: animals)
			System.out.println(animal); //����̳� ���� ����X  ������ ����!
		
		Object[] objs = new Object[3]; //�����,�� �� �� ��ü��..
		objs[0] = new Cat("�ط���"); //cat�� object�� ���θ�ǵ� �Ҵ�
		objs[1] = new Dog("�п���");
		objs[2] = new Dog("��ŭ��");
		
		for(Object obj: objs)
			System.out.println(obj);
		//������ �����Ͱ� ��� �� �� �ֱ� ������, object�� ������������ ��������ʴ´�. 
		//�׷��� �پ��� Ÿ�� �ް� ���� �� general����ϱ�
	}
}
