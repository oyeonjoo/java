package ch03.ex02;

public class C02Not { //������������ -> ���ǹ����� ���� ��
	public static void main(String[] args) {
		boolean power = false; //������ �����ִ�.
		power =! power; //toggle
						/*���� �ΰ����� ���� => flag variable.
						power�� ���� �ΰ� ���� ��� =!�� ����ϸ� false ->true , true -> false*/
		System.out.println(power);
		
		power =! power;
		System.out.println(power);
	}
}
