package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C(); //a,b,cŸ�� ��
		String msg = "";
		//c��ü�� CŬ������ �ν��Ͻ���. ������ true���.
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B(); //B, ObjectŸ�԰���
		msg = "";
		//c��ü�� CŬ������ �ν��Ͻ���. ������ true���.
		if(b instanceof C) msg += "C "; //����
		if(b instanceof B) msg += "B "; //��
		if(b instanceof A) msg += "A "; //����
		if(b instanceof Object) msg += "Object"; //��
		System.out.println(msg);
		//instanceof���� ������ ��Ӱ���� ���� �͵鸸 ������.
		
		//F�� ������������ Ŭ����. ����
		//if(b instanceof F)
		//if(c instanceof F)
		
		F f = new F();
		msg = "";
		if(f instanceof A) msg += "A"; //�������̽��� �����Ӱ� ��������. Ŭ������ ���ΰ͸� �����ִ�.
		System.out.println(msg);//������ X, ���൵ �ߵ� (�׷��� �����̾ ���x)
			
	}
}
