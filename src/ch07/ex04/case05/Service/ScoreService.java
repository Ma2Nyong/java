package ch07.ex04.case05.Service;

import ch07.ex04.case05.domain.Score;

public interface ScoreService {
	void addScore(Score score);
	Score[] getScores();
}
