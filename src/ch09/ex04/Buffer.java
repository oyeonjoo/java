package ch09.ex04;

public class Buffer { //�ӽ������ 
	private Integer val;
	
	public synchronized int remove() { //remove��ȣ���� �����带 ����.�������� ��ٸ�
		while(val == null) {
			try {
				wait(); //ObjectŬ������ thread�� ������ wait�� �ִ�.
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		//����] ���´�.�� ǥ���ϼ���.
		this.val = null;  
		
		notifyAll();
		
		return val;
	}
	
	public synchronized void add(Integer val) {//����ȭ, <->�񵿱�ȭ 
		while(this.val != null) { //���̾ƴ϶�� ����ؾ���
			try {
				wait();
			} catch(Exception e) {}
		}
		
		this.val = val;
		notifyAll(); //?? �� �� �˷��ش�. �ٸ� ������ ���ü��ִ�???
		
	}
}