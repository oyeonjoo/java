package ch05.ex05.case07;

public class Retailer {//�Ĵ������� ���ɤ� ,�Ǹ��Ҷ� ��δ� ������ �ʿ�, ������ڴ� ����� �ʿ�. 
	//public Apple sell(Apple apple, int price, int marsine){}
	
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2); //������ ���̴� �� �ڵ�� ǥ��
		
		return apple;
	}
}
//���⼭ apple�� �귯���� ��?�̶�� ���� : DTO 
//����� �����Ͷ�� ���� : domain (�Ķ���ͷ� �������� ����, �����ͷ� ������ ����) 
 //��������� X �� domain X 