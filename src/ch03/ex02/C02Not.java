package ch03.ex02;

public class C02Not { //������������ -> ���ǹ����� ���� ��
	public static void main(String[] args) {
		boolean power = false; //������ �����ִ�.
		power =! power; // ���� �ΰ� ���� ���� > flag variable,  !�� ���������� 
		System.out.println(power);
		// power�� ���� �ΰ� ���� ��� =!�� ����ϸ� false -> true , true -> false
		power =! power; // toggle(on&off)
		System.out.println(power);
	}
}
