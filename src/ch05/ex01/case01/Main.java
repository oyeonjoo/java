package ch05.ex01.case01;

public class Main { //������Ÿ������ ���������� ���α׷��� ����.
	public static void main(String[] args) {
		//��������
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d�� %d�� %d��\n", hour, minute, second);
		
		//��������� ��ü������ ���?�� �Ȱ��ƺ������� ������ ���忡�� �ٸ�.
		//��ü���� 
		Time time = new Time(); //Ŭ������ ������Ÿ�� ���鶩 new��� (Time time ��ü�� new�ϴ� ��)
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d�� %d�� %d��\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time(); //Time��Ŭ�����ȿ� n�� ��ü ���� �����ϴܰ� �����ֱ�
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d�� %d�� %d��\n", time2.hour, time2.minute, time2.second);
		
		//Ÿ���� �ּ� ����
		System.out.println(time);
		System.out.println(time2.toString()); //.toString() -> �� �����Ǿ��ִ� ��!! println�� �ڵ����� �����ֱ� ����!
		
	}
}
