package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent { //�ٸ����׻�� �ڽ� 
	public void play() {
		//this.getRegNum(); private����X
		this.getName();
		this.getMoney(); //protected �ڽ��� ���ٰ���
		//this.addMoney(1000);
	}
}
