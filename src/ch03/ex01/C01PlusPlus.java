package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		//������ ++�������� ��ġ ��� X
		int i = 0;
		++i;
		System.out.println(i);
		i++; // i������ ����� ��1 ���� ++ 1���ؼ� 2�� i������ �ֱ�.
		System.out.println(i);
		
		// ��ġ�� ���� �ٰ��� �ٸ��� Ȯ�� =>������ �켱���� �����ؾ���.
		i = 0;
		int j = ++i; // ���� �տ� ++ > ++ ���� ���� ��,  �Ҵ翬����(=) ����
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i++; // ���� �ڿ� ++ > �Ҵ翬����(=) ���� ���� ��, ++ ����
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
