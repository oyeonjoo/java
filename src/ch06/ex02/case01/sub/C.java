package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;
//����Ҷ��� AŬ���� ��ã�� => import�ؾ���! 
public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a; private
		//x = this.b; �ٸ���Ű��
		x = this.c; //�ٸ���Ű���� �ڽ��̸� ������ : protected =>default�� ����
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
	
}
