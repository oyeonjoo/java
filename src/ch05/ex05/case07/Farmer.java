package ch05.ex05.case07;

public class Farmer { //��� ����� �Ǵ�.
	public Apple sell(int price) { //������ �Ķ���ͷ� �д�.
		Apple apple = new Apple();
		apple.setPrice(price);
		
		return apple; //�Ķ���ʹ� �⺻Ÿ�� ���� Ÿ���� Ŭ����! (��ü�� ������!�⶧��)
	}
}
