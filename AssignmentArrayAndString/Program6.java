//WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.

package AssignmentArrayAndString;

public class Program6 
{
	public static void main(String[] args) {
		String str=new String("Ganesh");
		String ans =str.intern();
		System.out.println("Heap memory:"+str);
		System.out.println("String Constunt pool:"+ans);
	}
}
