package _01_factoryPattern;

import java.util.Calendar;

public class ProductRun {
	public static void main(String[] args) {
		Product p = ProductFactory.getInstance("tv");
		System.out.println(p);
		
		p = ProductFactory.getInstance("computer");
		System.out.println(p);
		
		System.out.println(Calendar.getInstance().getClass());
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
	}
}
