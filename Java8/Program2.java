/* WAP to check the given sequence of character in given string. Suppose 
that you are given following string “Taj is situated in Agra.” And you 
have to find following sequence AST. AST should be one after another. If 
you found sta, or tas, or tsa it should print string not found. */

package Java8;

import java.util.function.Predicate;

public class Program2
{
	public static void main(String[] args) {
		Predicate<String> predicate=str->str.contains("AST");
		if(predicate.test("Taj is situated in Agra AST"))
		{
			System.out.println("String Found...");
		}
		else
		{
			System.out.println("String not Found...");
		}
	}
}
