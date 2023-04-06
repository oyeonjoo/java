package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao {
	private Score[] scores;
	private int cursor;
	
	public ScoreDaoImpl (Score[] scores) {//DAO�� ������������ �����ͺ��̽��� �־����. DB�غ�Ǿ���� DAO
		this.scores = scores;
	}
	
	@Override
	public 	void insertScore(Score score) { //�ڽ� �������̵����� �����ڴ� �θ������ں��� �̻��̾����.=>so public!
		this.scores[cursor++] = score;
	}
	@Override
	public Score[] selectScores() { //�굵 public
		return this.scores;
	}
}
