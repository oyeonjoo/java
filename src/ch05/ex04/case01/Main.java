package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width, Card.height); //Card適掘什拭赤澗 width.
		
		Card.width = 10; //糎仙敗
		Card.height = 20;
		
		//Card.kind; //糎仙馬走 省製.昔什渡什呉獄 
		//Card.number;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart"; //card1.kind 羨砧紫 ............
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("\n%s, %s\n", card1.kind, card2.kind);
		System.out.printf("%d, %d\n", Card.width, Card.height); //是殖 梓端持失穿, 戚闇 梓端 持失 板.
		System.out.printf("%d, %d\n", card1.width, card1.height); //葛空匝精 拭君X 井壱. 戚係惟 床走源虞 訊? 
		//Static痕呪 澗 梓端.ししし / 昔什渡什痕呪澗 適掘什.しししし 
		
		card1.width = 100;
		System.out.printf("%d, %d\n", card1.width, card2.width);
 	}
}