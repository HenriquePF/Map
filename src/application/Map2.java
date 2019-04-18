package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Map2 {

	public static void main(String[] args) {

		Map<Product, Double> products = new HashMap<>();
		
		Product p1 = new Product("TV", 900.0);
		Product p2 = new Product("Computer", 2000.0);
		Product p3 = new Product("Smartphone", 600.0);
		
		products.put(p1, 10000.0);
		products.put(p2, 20000.0);
		products.put(p3, 15000.0);
		
		Product ps = new Product("TV", 900.0);
		
		//If there was no HashCode and Equals the comparison would be by pointers
		//When there IS HashCode and Equals, the comparison here results in true
		System.out.println("Contains 'ps' key: " + products.containsKey(ps));
		
	}

}
