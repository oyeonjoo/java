package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		//������ ++�������� ��ġ ��� X
		int i = 0;
		++i;
		System.out.println(i);
		i++; //i������ ����� ��1 ���� ++ 1���ؼ� 2�� i������ �ֱ�.
		System.out.println(i);
		
		//���� ��ġ�� ���� �ٸ��� Ȯ�� =>������ ����?���� �ؾ���. �켱���� �ִٴ� �� ����ϱ�!!!!!
		i = 0;
		int j = ++i; // ++�������� �� =�Ҵ� ���߿� ����
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i++; //++�� �����ڿ� ���� �Ҵ� ����. =�������� �� ++����
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
