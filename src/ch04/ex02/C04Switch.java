package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long.";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don't know.";} // case 옆에 블록을 칠때는 실행문으로 바꿔주기 위해
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long.";}
		}; 
		System.out.println(msg);
		
		//yield: keyword X, restricted identifier O 제한자 이다.
		int yield = 1; // 나쁜코드
		System.out.println(yield);
		//int switch = 1; << keyword는 compile error 가 동반된다. yield는 keyword가 아니다.
	}
}
