package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A(); //����test�޼ҵ����ϸ� A��ü ������ ��(�翬 B��ü�� �����ϴ»��¿��� ����,B.test���Ұű⶧��)
		
		int x = 0;
		//x = a.a; => �����Ͽ��� : A��ü�� a�� private������,A��ü���λ�뤷,�ܺ� ���X)
		x = a.b;
		x = a.c;
		x = a.d;
		
		//a.m1(); �޼ҵ嵵 ��������. private�̱⶧��. ���������� �������� ������
		a.m2();
		a.m3();
		a.m4();
		
	}
}
