package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		List<Ball> balls = new ArrayList<>(); //�� 6�� ���� List
		
		for(int i = 0; i < 6; i++)
			balls.add(slot.chuck()); //slot�� ���س� ���� balls�� ��Ƶд�.
		 
		for(Ball ball: balls) {
			//System.out.print(ball.getNum() + " ");
			System.out.print(ball);
		}
	}
}
/*
ch07.ex04.case04 �ζǸ� List�� refactoring�϶�.

List<Ball> ball = new ArrayList<>();
List<List<Ball>> slot = new ArrayList<>();

for(int i = 0; i < 6; i++) {
	int num = (int)(Math.random()*45);
	ball.add(new Ball(num));
}

slot.add(ball);
System.out.println(slot);
*/