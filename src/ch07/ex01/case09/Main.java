package ch07.ex01.case09;

public class Main { //�̾߱� �����Ϸ��� ���θ���.
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);//setGun / pistol�� gun���� ���θ��
		shooter.fire();
		
		shooter.setGun(rifle); //rifle�� setGun�� �Ķ���ͷ� ���̸鼭 gun���� ���θ��
		shooter.fire();
	}
}
