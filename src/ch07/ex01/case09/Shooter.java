package ch07.ex01.case09;

public class Shooter { //has a Gun
	private Gun gun; //defendency
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) { //������� Ÿ���� �������̽��� �д�! => why? Ȯ�强���Ͽ�
		this.gun = gun;
	}
}
