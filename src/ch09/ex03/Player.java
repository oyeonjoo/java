package ch09.ex03;

public class Player extends Thread {
	private Counter counter;
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease(); //���ڸ�. �÷��̾�1���� ��� ����X����?
			
			if(i % 10 == 0) counter.print();
			
			try {
				sleep((int)(Math.random() * 2)); 
			} catch(InterruptedException e) {} 
		}
	}
}
//�÷��̾� ���� �������. �⺻ī���ʹ� 0��, �׷��� �Ѹ��� �ݺ��ϸ� �ᱹ ���� 0 -> ���ο���