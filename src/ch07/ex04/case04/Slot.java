package ch07.ex04.case04;

public class Slot {
	private Ball[] balls; //������ ���� �� �ִ� �迭.����!
	
	public Slot() {//slot�ʱ�ȭ
		balls = new Ball[45]; //�迭��ü �����
			
		for(int i = 0; i < balls.length; i++) 
			balls[i] = new Ball(i + 1); //�ζ� ���� 1������ �����ϴϱ�
						//�� new Ball�� ���� �ϳ� �����
	}
	
	public Ball chuck() { //���� ���س���.
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45); //i�� ��������, i���� 0~44���� ���
			ball = balls[i]; //�������� ������ �ε����� ���ϳ��� ���� ��Ҵ�.
			balls[i] = null;
		} while(ball == null);
		
		return ball;
	}
}