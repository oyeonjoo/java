package ch03.ex02;

public class C02Not { //논리부정연산자 -> 조건문에서 많이 씀
	public static void main(String[] args) {
		boolean power = false; //전원이 꺼져있다.
		power =! power; // 값이 두개 뿐인 변수 > flag variable,  !는 부정연산자 
		System.out.println(power);
		// power의 값이 두개 뿐일 경우 =!를 사용하면 false -> true , true -> false
		power =! power; // toggle(on&off)
		System.out.println(power);
	}
}
