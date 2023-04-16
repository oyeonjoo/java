package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = ""; // ���� ���: 0 / �̱�� ���: 1, -2 / ���� ���: -1, 2 �� �߻�ȭ
		
		System.out.print("1.����, 2.����, 3.��\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3)  + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {//�Է°��� ��ȿ�� ����
			switch(playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair.";
			}
			
			switch(playerChoice) { //���ڵ�. ���ڸ� �ٽ� ���ڷ� �ٲٴ� ��
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
 			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
 			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1, 2, 3 ���� �ϳ��� �Է��ϼ���.";
		}
		
		System.out.println(result);
	}
}
//���ڵ� �κ��� ��ºκп��� �ϱ�
/*
����] �۰� ������������ �϶�.
���� ����� �˷��ش�.
�����
You win.
You lose.
Fair
���� �ϳ��̴�.
---
1.����, 2.����, 3.��
> 1
You: ����
Me: ��

You win.
*/



/*
int you = 0;
int me = 0;
String result = "";
String yc = ""; //yourChoice
String mc = ""; //myChoice
String fair = "Fair";
String lose = "You lose";
String win = "You win";

System.out.print("1.����, 2.����, 3.��\n> ");
you = sc.nextInt();
me = (int)(Math.random()*2) + 1;

if (you == 1) {
	if(me == 1) result = fair;
	else if(me == 2) result = lose;
	else if(me == 3) result = win;
}

if(you == 2) {	
	if(me == 1) result = win;
	else if(me == 2) result = fair;
	else result = lose;
}

if(you == 3) {
	if(me == 1) result = lose;
	else if(me == 2) result = win;
	else result = fair;
}

if(you == 1) yc = "����";
else if(you == 2) yc = "����";
else yc = "��";

if(me == 1) mc = "����";
else if(me == 2) mc = "����";
else mc = "��";

System.out.printf("You: %s\nMe: %s\n\n%s", yc, mc, result);
*/