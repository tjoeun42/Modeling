package _02_Builder.builderConstructor;

import java.util.Scanner;

public class SubWayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder(15, "화이트", "칠리").build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(30,"통밀","핫소스")
						.setCheese("모짜렐라")
						.setVegetable(true)
						.build();
		System.out.println(menu2);
		
		// 나중에 추가
		Scanner sc = new Scanner(System.in);
		
		SubwayBuilder subwayBuilder = new SubwayBuilder(15, "하티", "올리브오일")
											.setCheese("모짜렐라");
		
		System.out.print("추가토핑을 선택하세요 : ");
		String exTopping = sc.nextLine();
		
		Subway menu3 = subwayBuilder
						.setExtraTopping(exTopping)
						.build();
		System.out.println(menu3);
	}
}
