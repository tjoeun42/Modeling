package _02_Builder.builder;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder()
						.setBread("통밀")
						.setSize(15)
						.setCheese("모짜렐라")
						.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder()
						.setBread("통밀")
						.setSize(15)
						.setCheese("모짜렐라")
						.setVegetable(true)
						.setSource("청양마요")
						.build();
		System.out.println(menu2);
	}

}
