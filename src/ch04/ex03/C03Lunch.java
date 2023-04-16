package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) { // 30칼로리가 채워지면 배부름.
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");
				break; // while블럭을 빠져나온다
			}
			
			calorie += food;
		}
		System.out.println(calorie + "cal.만큼 먹었습니다."); //배불러서 멈추는 경우
	}
	
}
/*
배 부를 때까지 먹을거야.
-> 배가 고프면 먹어야지.
상한음식 나오면 그만 먹어. (상한음식 => 5의 배수)
*/