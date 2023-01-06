package ch07.ex04.case05;

import ch07.ex04.case05.Service.ScoreService;
import ch07.ex04.case05.Service.ScoreServiceImpl;
import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.presentation.ScoreIo;

public class Main {
	public static void main(String[] args) {
		ScoreDao scoreDao = new ScoreDaoImpl(new Score[5]);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
	}
}
