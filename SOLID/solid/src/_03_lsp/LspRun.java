package _03_lsp;

class Cat {
	void speak() {
		System.out.println("야옹");
	}
}

class WhiteCat extends Cat {
	String color = "white";
	/*
	@Override
	void speak() {
		System.out.println("야~~~옹");
	}
	*/
}

class BlackCat extends Cat {
	String color = "black";
	/*
	@Override
	void speak() {
		System.out.println("크아아~~");
	}
	*/
}

public class LspRun {
	public static void main(String[] args) {
		Cat cat = new WhiteCat();
		cat.speak();
		
		cat = new BlackCat();
		cat.speak();
	}

}
