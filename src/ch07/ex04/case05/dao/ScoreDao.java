package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score); //�߰�
	Score[] selectScores(); //�б�޼ҵ� ���ͷ�����
	//score�迭��ü
}
