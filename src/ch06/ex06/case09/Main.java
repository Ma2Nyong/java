package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out();
		browser.out();
		
		UI.in();
		//console.in();
		//browser.in(); 
		//Console.in();
		//Browser.in(); interface의 있는 static method 는 상속이 안된다.
		
		chrome.out();
		//chrome.in(); 마찬가지로 instance method는 가지고 올수 있지만.
		//Chrome.in(); static method는 가지고 올 수 없다.
	}
}
