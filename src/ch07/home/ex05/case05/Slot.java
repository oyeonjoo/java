package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls; //������ ���� �� �ִ� �迭.����!
	
	public Slot() {//slot�ʱ�ȭ
		balls = new ArrayList<>();
	
		for(int i = 1; i <= 45; i++)
			balls.add(new Ball(i));
	}
	
	public Ball chuck() { //���� ���س���.
		int i = (int)(Math.random() * balls.size()); //���ʿ��� size���� 45
		return balls.remove(i); //�������ϸ� size44�� (�ѹ��Ҷ����� size �پ��.)
	}
}