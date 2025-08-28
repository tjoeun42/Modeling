package _01_factoryPattern;

public class ProductFactory {
	static Product getInstance(String name) {
		Product product = new Product();
		
		if(name.equalsIgnoreCase("tv")) {
			product.setName(name);
			product.setPrice(300);
		} else if(name.equalsIgnoreCase("computer")) {
			product.setName(name);
			product.setPrice(200);
		}
		
		return product;
	}
}
