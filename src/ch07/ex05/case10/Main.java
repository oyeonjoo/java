package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>(); //������ �������� ���� ����. ���亿�� �ܿ�
		
		corps.add(bumblebee);
		corps.add(prime);//������ ������ �ܿ��� ����.
		
		for(Autobot autobot: corps) { //�����������������X, ���亿�� �ο�
			autobot.run();
			autobot.fight();
			//autobot.guard(); ���亿�� ������ ���� ����������, ���⼱ �׳� ���亿��.
			//���� :Ÿ���� �ٲٴ�. ĳ������ X ���亿�� ������� ���������� �𸣴ϱ�
			
			//��������� ���������� �����غ���. ������ ĳ����
			if(autobot instanceof Bumblebee) ((Bumblebee)autobot).guard();
			if(autobot instanceof Prime) ((Prime)autobot).command();
			
		}
		
	}
}
