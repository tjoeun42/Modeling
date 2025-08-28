package _02_Builder.constructor;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway(15, "허니오트", "핫칠리");
		System.out.println(menu1);
		
		Subway menu2 = new Subway(30,"통밀","모짜렐라","아보카도",true,"스위트칠리");
		System.out.println(menu2);
		// 인자의 순서도 햇갈림

	}

}
