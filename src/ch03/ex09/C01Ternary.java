package ch03.ex09;

public class C01Ternary { //���׿�����
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x; // x�� 0���� ũ�ų� ������ x��, ������ -x�� �����Ѵ�. ���׿����� ���� ���� ���� ���� �� �� �ִ�. ���ǹ��� true�� ù��°������, false�� �ι�°�� ����.
		int absY = (y >= 0) ? y : -y; // ���밪�� ���ϴ� �˰����̴�.
		
		System.out.printf("absX: %d\nabsY: %d", absX, absY);
	}
}
