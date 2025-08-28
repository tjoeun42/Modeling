package _02_Builder.builderConstructor;

public class SubwayBuilder {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	// 필수 멤버 빌더의 생성자를 통해 설정
	SubwayBuilder(int size, String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}
		
	// setter 메소드
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
	
	// Subway의 생성자 호출
	public Subway build() {
		return new Subway(size, bread, cheese, extraTopping, vegetable, source);
	}

	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vegetable=" + vegetable + ", source=" + source + "]";
	}
}
