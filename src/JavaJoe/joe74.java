package JavaJoe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class joe74 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "joe");
		map.put("stage", 2);
		map.put("sound", true);
		map.put("other", 2);
		System.out.println(map);
		System.out.println(map.get("name"));
		
		
		System.out.println("-----------------");
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		System.out.println("----------------------");
		Collection<Object> values = map.values();
		for(Object obj:values) {
			System.out.println(obj);
		}
	}

}
