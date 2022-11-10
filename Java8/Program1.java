/* WAP to check the given no is palindrome or not. Don’t use divide 
method */

package Java8;

import java.util.function.Predicate;

public class Program1 
{
	public static void main(String[] args) {
		Predicate<Integer> predicate=no->{
			int num=no,rev=0;
			while(no>0)
			{
				rev=rev*10+(no%10);
				no=no/10;
			}
			if(rev==num)
				return true;
			else
				return false;
		};
		if(predicate.test(121))
		{
			System.out.println("Number is Palindrome...");
		}
		else
		{
			System.out.println("Number not paindrome..");
		}
		
	}
}
