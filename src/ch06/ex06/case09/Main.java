package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
	
		console.out();
		browser.out();
		
		//�Է¹ް�ʹ�. 
		UI.in(); //in�޼ҵ尡 UI�� �ִٴ� �����˷��ֱ� ���Ͽ�. �ܼ����� �������� ����ʿ�X
		
		System.out.println();
		Chrome chrome = new Chrome();
		//chrome.in(); static�޼ҵ� ����X
		chrome.out();
		chrome.play(); //play static�޼ҵ�. chrome.in�� �������� ����?
		Chrome.play(); //play�� Browser�� �ִ� ������ ChromeŬ�����ε� ȣ���� ���������� �������ڵ�!
		Browser.play(); // �̰� ���� �ڵ���.
	}
}
