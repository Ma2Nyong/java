package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 80;
		int jumpCnt = 0;
		//반복의 조건은 알지만, 반복해야 하는 횟수를 모를때 쓴다.
		while(weight > 60) {
			jumpCnt++;
			weight--;
		} // false가 나올때까지 반복한다.
		
		System.out.printf("%d번 줄넘기해서, 몸무게 %dkg이 되었습니다.", jumpCnt, weight);
	}
}
// 처음부터 false 가 나올수 있다. 해서 0회이상 반복할때 한다.