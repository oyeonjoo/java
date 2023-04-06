package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	//static �� =>����Ʈ�ڵ� �ε��� ���Ŀ� static�� �ٷ� �����.
	static {
		sc = new Scanner(System.in); //static ��¼����¼�� �ʱ�ȭ �ϰ� �;���.
	}
	
	private static void inMsg(String msg) {//�Է¾ȳ��޽��� input�� �ձ��ڵ��Ȥ�
		System.out.print(msg + "\n> ");		//�Ⱥ��̰�...���߱�...?privat..?
	}
	
	public static String inStr(String msg) { //�ܺο��� ���� ���� public
		Console.inMsg(msg);
		return sc.nextLine().trim(); //chainning. .�ؼ� �ٸ��޼ҵ� ���ϰ� ���ϰ� �ϴ� �� 
										//�� chaining ���� ���� : 
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	//�˸��޽��� �����ִ� �޼���
	public static void info(String msg) {
		System.out.println(msg);
	}
	//�����޽���
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
