package ch06.ex06.case08;

public interface Animal {
 	//void eat(); Ȯ���Ϸ��� ��.
	//void eat() { } �߻�޼ҵ忡 �ٵ� ����� ����! �߻�޼ҵ�� �ٵ� �ʿ������
	default void eat() { //default������ �־������. ���� �� ���� default?
		System.out.println("������ �Դ�.");
	}
	
	void move(); //���� ���ư����� �ɾ���� ����
	
}
