/*WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and 
print the detail.*/

package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program6 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("pune", 298298);
		map.put("mumbai", 83774);
		map.put("ahmednagar", 123432);
		map.put("aurangabad", 7645);
		map.put("nashik", 2133);
		map.put("sangali", 34233);
		
		TreeMap<String, Integer> map2=new TreeMap<>(map);
		System.out.println(map2);
		
	}

}
