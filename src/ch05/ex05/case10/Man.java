package ch05.ex05.case10;

public class Man {
	//�޼ҵ带 ����ص� �ߺ��ڵ尡 �߻� ��� �׸��� �ذ�����غ���
	public void strip( ) {}
	public void wash() {}
	public void wear(Pajamas pajamas) {} //man�� ���ڸ��� �Դ´�. wear�Ϸ��� ���ڸ� �ʿ�
	public void lie() {} // ���� �ܴ�.//���ڴ� ����. ���ϸ��� ���ѹݺ�.
	
	//���� ���ڱ� ���ѹݺ����� �ߺ��ڵ� �߻� => ���ڴ� �޼ҵ� �� �����
	public void sleep(Pajamas pajamas) {
		this.strip(); //�ڱ��ڽ� �޼ҵ� ���� �� ����!! this.
		this.wash();
		this.wear(pajamas);
		this.lie();
	}

}