package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int price = 30_000;
		int tot = 0; //손에 쥔 돈
		int tmp = 0; //꺼낸 돈
		
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000; //최소 천원, 최대 3만원
			System.out.println(tmp);
			tot += tmp;
		}
		
		System.out.printf("\n%d원을 꺼냈다.", tot);
		/*
		int money = 0;
		int sum = 0;
		
		while(sum < 30000) {
			money = ((int)(Math.random() * 30) + 1) * 1000;
			sum += money;
			System.out.println(money);
		}
		
		System.out.printf("%d원을 꺼냈습니다.", sum);
		*/
	}
}
/*
과제] 3만원짜리 물건값을 치뤄라.
지갑에 5만원권은 없다.
꺼낸 돈의 권(종류)을 구별하지 않는다.

지갑에서 지폐를 여러번 꺼낸다.

한번 꺼낸 돈의 합계는 3만원 이하이다.
꺼낼때마다 꺼낸금액을 출력한다.
---

12000
2000
6000
10000

30000원을 꺼냈습니다.
*/