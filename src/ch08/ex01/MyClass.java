package ch08.ex01;

//@Field ������ ����.  
@Universal
@Type(name="class", value=1) //Type������̼�, �Ӽ���=�Ӽ�Ÿ�Ը°� ��ǥ�� ����, �����͸� ��Ÿ������)
public class MyClass {
	//�Ӽ�������ϰ� �Ӽ����� �� �� �ִ�. or value=1�� �� ���� ����.
	@Field(1) @Universal
	private String name;
	
	@Constructor 
	public MyClass() {
	}
	
	/*
	@Method //�޼ҵ������̼� 
	public void play() {
		
	}
	*/
	
	@Method 
	public void play(@Param String name, @Param int age) {//�Ķ�������̼� ����ϴ� 
		@Local int i = 0; //���þ�����̼� ���
	}
	
}
