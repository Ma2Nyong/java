package ch07.ex04.case05.presentation;

import ch07.ex04.case05.Service.ScoreService;
import ch07.ex04.case05.domain.Score;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	//과제: 5명의 국,영,수 점수를 user가 입력토록하라.
	/*public void play() {
		Score[] scores = new Score[5]; // 실제 앱이라면 유저가 5번 입력을 할것이다.
		for(int i = 0; i < scores.length; i++)
			scoreService.addScore(
					scores[i] = new Score(
							Console.inNum("국어점수를 입력하세요."),
							Console.inNum("영어점수를 입력하세요."),
							Console.inNum("수학점수를 입력하세요.")));
		scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
	}
	*/
	public void play() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < 5; i++) {
			kor = Console.inNum("국어");
			eng = Console.inNum("영어");
			math = Console.inNum("수학");
			
			scoreService.addScore(new Score(kor, eng, math));
		}
		
		Score[] scores = scoreService.getScores();
		for(Score score: scores)
			Console.info(score);
	}
}
