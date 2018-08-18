package JavaJoe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class joe71 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		//set.add(12);
		//set.add(34);
		//set.add("joe");
		//set.add(new Bike());
		//set.add(12);
		//set.add(34);  //元素不重複
		//System.out.println(set);

		while(set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
	
		System.out.println("--------------------------------------");
		
		
		for(Integer num :set) {
			System.out.println(num);
		}
		
		
		
		
		
	}

}
