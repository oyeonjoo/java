package ch07.ex04.case05;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
				{90, 90, 90},//�� �迭��ü�� socres�迭�� ����
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		}; //ǥ�� �ڹٿ��� ���߹迭�� ǥ����.
		
		System.out.println("��ȣ ���� ���� ���� �հ� ���"); //�հ������ �ο쵥���ͷ� ���� ������
		System.out.println("-----------------------");
								//length�� ���� 5!
		for(int i = 0; i < scores.length; i++) { //���ڵ带 �ϳ��� �̵�
			int sum = 0; 
			
			System.out.print(" " + (i + 1) + " ");
			for(int j = 0; j < scores[0].length; j++) { //�ʵ带 �ϳ��� �̵�
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[0].length);
		}
	}
}