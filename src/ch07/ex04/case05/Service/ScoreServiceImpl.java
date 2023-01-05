package ch07.ex04.case05.Service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		// return scoreDao.selectScores();
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}
	// 과제: 학생별 합계, 평균 필드를 채워라.
	private void calcScore(Score[] scores) {
		//domain의 국영수 seter를 이용하여 점수를 채우고 합계평균의 geter를 이용하여 채운다.
	}
}
