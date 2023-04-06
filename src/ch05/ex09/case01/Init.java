package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	//static�ʱ�ȭ��
	static {
		//this.i = 1; //�����Ͽ��� : this������ �޼��� ù��°�Ķ���Ϳ��� this�� ������ �Ʊ� ������ ��� ����. 
		//���⼱ this������ ������� �ʾұ� ������ ���� ����.
		Init.s = 1; //s�� ����ƽ�������� ��Ȯ�� �˷��ֱ� ���� Init.����! ��� �˾Ƶ���.
		System.out.println("static{}"); //����Ʈ�ڵ� �ε� �� ����..?	
	}
	
	//�̸����º� : �ν��Ͻ��ʱ�ȭ��.(�޼ҵ�Ⱦƴ� Ŭ�����ȿ� �ִ°���! ���� �����Ŷ� �޶�)
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}"); //new���� �����Ȱ�
	}
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
	}
}
