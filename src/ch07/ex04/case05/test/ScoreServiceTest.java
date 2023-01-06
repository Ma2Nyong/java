package ch07.ex04.case05.test;

import ch07.ex04.case05.Service.ScoreServiceImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.presentation.Console;

public class ScoreServiceTest {
	public static void main(String[] args) {
		ScoreServiceImpl scoreService = new ScoreServiceImpl();
		
		Score[] scores = new Score[5];
		for(int i = 0; i < scores.length; i++)
			scores[i] = new Score(
					Console.inNum("국어"),
					Console.inNum("영어"),
					Console.inNum("수학"));
		
		//scoreService.calcScore(scores); //calcScore를 public으로 변경해야 테스트가능,
		for(Score score: scores) System.out.println(score);
	}
}
