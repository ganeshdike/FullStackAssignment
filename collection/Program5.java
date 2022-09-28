//WAP to store data related to item in Vector and after that sort the data.

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Program5 
{
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("akash");
		vector.add("sham");
		vector.add("ram");
		vector.add("ganesh");
		vector.add("ram");
		
		Collections.sort(vector);
		System.out.println(vector);
	}
}
