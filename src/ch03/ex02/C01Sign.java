package ch03.ex02;

public class C01Sign {
	public static void main(String[] args) {
		//��ȣ������
		int i = -10;
		i = +i; //i������ �� -10�� �о *1�� �ϴ� ��. -10�����Ͽ� i�� ����.
		System.out.println(i);
		
		i = -10;
		i = -i; //������ ��Ÿ���� ��ȣ������, i�� -10 * -1 = 10,��� 10�� ����.
		System.out.println(i);
	}
}
