package JavaJoe;

import java.util.LinkedList;

public class joe72 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Joe");
		names.add("Manny");
		names.add("chris");
		names.add("Manny");
		names.add("GGininder");
		System.out.println(names.size());
		System.out.println(names);
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println(names.get(3));

	}

}
