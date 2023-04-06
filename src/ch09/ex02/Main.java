package ch09.ex02;

public class Main { //������ ���� ������ �׽�Ʈ�غ���
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter()); //����������� �Ķ���ͷ� runnalbeŸ�� ���� ����
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000); //���� , 1�ʵ��� �ٶ󺻴�. main�� ������
				System.out.print(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); //ī���Ͱ� �ڰ��ִٸ� �����
				counter.join(); //ī���Ͱ� ���������� ��ٸ���
				
			}
		}
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}