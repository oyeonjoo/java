package ch07.ex04.case05;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.presentation.ScoreIo;
import ch07.ex04.case05.service.ScoreService;
import ch07.ex04.case05.service.ScoreServiceImpl;


public class Main2 {
	public static void main(String[] args) {
		Score[] scores = new Score[5]; //DB�غ�
		/*
		for(int i = 0; i < scores.length; i++)
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		*/
		ScoreDao scoreDao = new ScoreDaoImpl(scores); //�Ķ���ͷ� ������ ���� DB�־��ֱ�
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
		
	}
}
/*
���� ScoreIo�� �ǵ鿩�� 5���� ����(������ ��)�Է� �� �������ϱ�
ScoreDao�� �Ű澵�ʿ� X IO�� service�� ��ȭ�ϸ� ����.
*/