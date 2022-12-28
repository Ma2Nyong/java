package ch05.home.ex02;

public class Paper {
	private String msg;
	private String writerName; // writername 은 객체이고. writer는 속성이다.
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getWriterName() {
		return writerName;
	}
	
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
}
