package ch06.ex06.case05;

import java.time.LocalDate;

//�������̽��� ������� �Է��ϱ�. PUBLIC : ĸ��ȭX, ������ 
//�������̽�~ �ڵ���... �Ⱥ���......... �Ⱥ��Ұ�..... so final.... 
public interface Electronic {
	public static final int VOLTAGE = 200; //������ 200
	static final String MAKER_NAME = "LG";//public�Ƚᵵ public��
	final int WEIGHT = 10; //public static �Ƚᵵ ��
	LocalDate PRODUCED_DATE = LocalDate.now(); //public static final�ۼ� ���ص� �����Ϸ��� �˾Ƽ� ��.
	
	public abstract void displayMsg(); //�߻�޼ҵ常�鶧�� abstract�ۼ�.
	abstract int getTemperature(); //public ���� �����Ϸ��� �ڵ� �߰�
	String getModelName(); //public abstract���� �ڵ��߰���
	
}
