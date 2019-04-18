package application;

import java.util.Map;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		//TreeMap sort not only alphabetical, but is also upper/down case sensitive
		
		cookies.put("username", "John");
		cookies.put("email", "john@gmail.com");
		cookies.put("phone", "99887733");
		
		cookies.remove("email");
		//It keeps the key, but changes the value
		cookies.put("phone", "99887711");
		
		//CONTAINS: to look for, in this case, the key(phone) which is true.
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		//GET: get the number(value) by calling(get) the phone(key).
		System.out.println("Phone number: " + cookies.get("phone"));
		
		//GET: get email(key) and printing null, which is null, because of the remove.
		System.out.println("Email: " + cookies.get("email"));
		
		//To get the size of the map
		System.out.println("Size: " + cookies.size());

		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}	
	}
}
