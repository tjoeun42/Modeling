package _02_Builder.constructor;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	public Subway(int size, String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}

	public Subway(int size, String bread, String cheese, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.source = source;
	}
	
	public Subway(int size, String bread, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.vegetable = vegetable;
		this.source = source;
	}

	public Subway(int size, String bread, String cheese, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.vegetable = vegetable;
		this.source = source;
	}
	
	public Subway(int size, String bread, String cheese, String extraTopping, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.source = source;
	}

	public Subway(int size, String bread, String cheese, String extraTopping, boolean vegetable, String source) {
		super();
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vegetable = vegetable;
		this.source = source;
	}

	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping=" + extraTopping
				+ ", vegetable=" + vegetable + ", source=" + source + "]";
	}
}
