package ch07.ex02.presentation;

public interface Console {
	static void info(Object obj) {//�������̽� static�� public�� �پ�����
		System.out.println(obj);	//����̵� object���� ���θ�ǵ�
	}
}