package ch06.ex02.case01;

public class C extends A {
	public void test() {
		int x = 0;
		
		//Ŭ����B�� ��ü�� ������?�� �ٸ��� ����.
		//x = this.a; this�� C��ü �ڽ�. ��ӹ���AŬ�����Ǹ������ private�̸� ���X
		x = this.b;
		x = this.c;
		x = this.d;
		
		//this.m1(); private�� �ڽĵ� ���� ���� �� �� �־�!
		this.m2();
		this.m3();
		this.m4();
	}
	
}
