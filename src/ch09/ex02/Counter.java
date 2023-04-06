package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start."); //���罺���带 ���� �����带 ..
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try { //�����ϳ��ϳ� ��� ������ �� ����
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000); //1������
			} catch(InterruptedException e) {//���ع޴� �̼���
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
//�����尡 �ϴ� �� : �������