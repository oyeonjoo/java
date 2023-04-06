package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		//runnableŸ���� ��2�� ����� (������ ���� �� X)
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		
		//THREAD����� �Ǵٸ� ���
		Executor executor = Executors.newCachedThreadPool(); //thread�� ���̴� pool
		executor.execute(r1);
		executor.execute(r2);//������ΰ� �������
	}
}
