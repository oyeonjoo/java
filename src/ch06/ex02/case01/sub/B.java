package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		//A a = new A(); �����Ͽ��� :  sub��Ű���� AŬ������ ����.
		A a = new A(); //import�ؼ� AŬ������ ��ġ�� �����Ϸ����� �˷���.
		
		int x = 0;
		//x = a.a;
		//x = a.b; default b�� ���� => ���� ��Ű������ ���ٰ���, �ٸ���Ű���� ����X
		//x = a.c; protected�� ������Ű���� ���ٰ���, �ٸ���Ű���� ���ٺҰ���
		x = a.d; //public�� ����
		
		// a.m1(); private�̾�Ⱥ���
		//a.m2(); �ٸ���Ű������ �� ����
		//a.m3(); �ٸ� ��Ű������ �� ����
		a.m4();
	}
}
