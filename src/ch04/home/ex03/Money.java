package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int price = 30_000;
		int tot = 0; //�տ� �� ��
		int tmp = 0; //���� �� (temp/)
		
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000; //�ִ� 3���� �ּڰ� õ��
			System.out.println(tmp);
			tot += tmp;
		}
		
		System.out.printf("\n%d���� ���´�.", tot);
		/*
		int money = 0;
		int sum = 0;
		
		while(sum < 30000) {
			money = ((int)(Math.random() * 30) + 1) * 1000;
			sum += money;
			System.out.println(money);
		}
		
		System.out.printf("%d���� ���½��ϴ�.", sum);
		*/
	}
}
/* (����)
����] 3����¥�� ���ǰ��� ġ���.
������ 5�������� ����.
���� ���� ��(����)�� �������� �ʴ´�.

�������� ���� ������ ������.

�ѹ� ���� ���� �հ�� 3���� �����̴�.
���������� �����ݾ��� ����Ѵ�.
---

12000
2000
6000
10000

30000���� ���½��ϴ�.
*/