package ch05.home.ex05.case08;

public class Player {
	private String name;
	
	//public void pass(Ball ball) // void�� ���� ���� ������ �ִ�.
	public Ball pass(Ball ball) { //�н��ϰ��� �����־���ϱ� ������ returnŸ���� ball
		return ball;  //���� ���� ���� �״�� �ѱ�� ���� return �� ball
	}
	
	public Ball kick(Ball ball) { //ű�ϰ��� �����־�� �� => ����Ÿ���� ��
		return ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}//�̸��о ���Ұžƴϱ⶧���� getter�� �ȸ����, �÷��̾� �̸��� �ֱ� ���� setter�� �����.
//��ü�� ������! =>so ��ü�� �Ķ���ͷ� ��� �� �� �ְ�, ����Ÿ�����ε� �� �� ����.