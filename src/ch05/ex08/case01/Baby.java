package ch05.ex08.case01;

public class Baby {
	private String name;
	
	public Baby() {} //=> �����Ϸ��� ���� �ڵ����� �����Ǿ� ����.
	
	public Baby(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//�ҽ��ڵ忡�� �����ڰ� ������ ������ ����Ʈ�ڵ�󿡼� �����ڰ� ����. 