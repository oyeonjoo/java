package ch05.ex08.case03;

public class Citrus {
	private String name;
	
	//�����ڴ¾�� ȣ���ؾ��ϴ°�?
	public Citrus() {
		//this.Citrus("������"); new�����ڿ��� new�� ����
		//new Citrus("������"); //���ο� �����ڻ����Ӥ�
		this("������"); //=> �̷��� main���� null���� �ȳ���. ������1��
		//this.name = "������"; =>�����ڵ� ���� : �ߺ��ڵ�, �ϵ��ڵ�
	}
	
	public Citrus(String name) {
		this.name = name; //������� name
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
// ����: ������� - ������ - �Ϲݸ޼ҵ� - ���ͼ���