package mainpackage;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {
	
public static void main() {
	
	HashMap<Integer,String> map1 =new HashMap<Integer,String>();
	
	map1.put(1, "Peris Jepkorir");
	map1.put(2, "Nicholus Kipsang");
	map1.put(3, "Jemesunde");
	map1.put(4, "Emily Jelimo");
	map1.put(5, "Peter Kipchirchir");
	map1.put(6, "The Late Sarah");
	map1.put(7, "Joshuah Kipkosgei");
	map1.put(8, "Julius Kiptoo");
	map1.put(9, "Willy Cheruiyot");
	map1.put(10, "Dorcas Jepketer");
	
	System.err.println(map1.get(4));
	
	for(Map.Entry m:map1.entrySet()) {
		
		System.err.println("Key"+m.getKey()+"Value"+m.getValue());
	}
}
}
