package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		/*
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie(); //���� ���ڱ�
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie(); //������ ���ڱ� (�޼ҵ� �ߺ� �߻� => �޼ҵ� �� �����)
		*/
		man.sleep(pajamas);
		man.sleep(pajamas);
		man.sleep(pajamas);
		man.sleep(pajamas);// ���� 4������ �ϳ��� �ڵ��! �ߺ��� ���ϼ��ֵ�!!!
	}
}
