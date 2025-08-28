package _02_Builder.builder;

public class SubwayBuilder {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	// 1. 멤버에 대한 setter메소드 구현
	/*
	 * 메서드 지정하는 방법
	   - 일반 속성명과 동일하게 사용 가능
	   - with 키워드 : 일반 setter메소드와 차별화를 위해 with라는 키워드 사용
	   - 반환형은 클래스를 반환
	 */
	
	// public SubwayBuilder withSize(int size)  -> 사용가능
	public SubwayBuilder setSize(int size) {
		this.size = size;
		return this;
	}

	public SubwayBuilder setBread(String bread) {
		this.bread = bread;
		return this;
	}

	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}

	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}

	public SubwayBuilder setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
		return this;
	}

	public SubwayBuilder setSource(String source) {
		this.source = source;
		return this;
	}
	
	// 2. Subway의 생성자 호출
	public Subway build() {
		return new Subway(size, bread, cheese, extraTopping, vegetable, source);
	}

	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vegetable=" + vegetable + ", source=" + source + "]";
	}
}
