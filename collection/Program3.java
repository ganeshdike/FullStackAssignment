//WAP to store elements in List and remove all duplicates value from it. (Numbers 
//should be inserted). When duplicates are removed print all elements in ascending 
//order.

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program3
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(4);
		
		Set<Integer> set=new HashSet<>();
		set.addAll(list);
		System.out.println(set);
		
	}
}
