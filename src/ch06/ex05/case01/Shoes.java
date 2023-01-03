package ch06.ex05.case01;

public class Shoes extends Product {
	private int price;
	
	public Shoes(int price) {
		super(price * 2); // 부모의 price가 출력되는지 확인하려고 x2를함.
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		//return this.price;
		return super.getPrice();
	}
}
// 부모의 멤버와 자식의 멤버가 겹쳤을때,