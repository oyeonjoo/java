package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat(); //LifeŸ���� eat
		alien2.eat(); //AlienŸ���� eat
		
		alien1.shout(); // Life�� shout, �������̵� -> �ڽĸ޼������
		alien2.shout(); // Alien�� shout
		
		Life.eat(); //static�޼���� ���λ�� Ŭ�������� ����. �ȱ׷��� �ν��Ͻ��޼���� �ְ��Ұ��ɼ�����.
		Alien.eat();
	}
}
