package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.name = "â����";
		flower1.petalLength = 7;
		flower1.sepalLnegth = 2;
		
		flower2.name = "�ڽ���";
		flower2.petalLength = 4;
		flower2.sepalLnegth = 1;
		
		/*
		Flower iris = new Flower();
		iris.petalLen = 7;
		iris.calyx = 2;
		System.out.printf("â������ ���� ����: %dcm, �ɹ�ħ ����: %dcm\n", iris.petalLen, iris.calyx);
		
		Flower cosmos = new Flower();
		cosmos.petalLen = 4;
		cosmos.calyx = 1;
		System.out.printf("�ڽ����� ���� ����: %dcm, �ɹ�ħ ����: %dcm", cosmos.petalLen, cosmos.calyx);
		
		[�ǵ��]
		 1. FlowerŬ�������� â���� �ڽ��� ������X��. -> ���̸������͸� ���������ξ�
		   =>�����ʹ� ������ ���� �༮���� �����͸� �� �� x
		 	=>FLWOER�� NAME�̶�� ������� �����ϸ� �ذ�!
		 
		 2. FLOWERŬ�������� flowerpetalLength => (�ǹ�?)�ߺ�! �ɲ��ٱ��� �� ��. 
		 										�� �ٸ� �ߺ�! Ŭ������ flower�ε� �� flower��
		 
		*/
	}
}
/*
â������ ���� ���̰� 7cm, �ɹ�ħ ���̰� 2cm�Դϴ�.
�ڽ��𽺴� ���� ���̰� 4cm, �ɹ�ħ ���̰� 1cm�Դϴ�.
*/