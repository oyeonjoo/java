package ch08.ex02.case04;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public enum Job { //HR����01���� �츮�� ����� ��.
	EXIT, LIST, ADD, FIX, DEL; //ordinal�� �ڵ� �ο��� 0~4������
	
	public static Job toJob(int ordinal) { //���ڸ� job���� ���Ͻ�Ű��..
		return values()[ordinal]; //value�ڵ���� �迭�� ��Ե�, ordinal�� �ε����� ���.
	}
	
	public static Job toJob2(int ordinal) {
		/*
		Stream<Job> stream = Arrays.stream(values()); //values()�迭�� stream���� ��ȯ..?
		stream = stream.filter(job -> job.ordinal() == ordinal);
		Optional<Job> job = stream.findFirst(); //���Ұ� ��� �ִ� ù��° �� ������.
		return job.orElse(null); // �̾Ƴ� �ڵ带 �����ϰų� ������ null����
		 */
		
		//chaining
		return Arrays.stream(values())
				.filter(job -> job.ordinal() == ordinal)
				.findFirst()
				.orElse(null);
	}
}
