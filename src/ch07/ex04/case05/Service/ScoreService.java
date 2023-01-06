package ch07.ex04.case05.Service;

import ch07.ex04.case05.domain.Score;

public interface ScoreService {
	void addScore(Score score); // 점수를 파라미터로 받는다.
	Score[] getScores();
}
