/* User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4 
454. 1 to check given no is even, 2 for odd number, 3 for Armstrong 
number, 4 for palindrome number.  */

package Java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Program3 
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int first=scanner.nextInt();
		
		System.out.println("Enter Second Number:");
		int second=scanner.nextInt();
		if((first<1) || (first>4))
		{
			System.out.println("Please Enter First Number 1,2 and 3 ");
		}
		else
		{
			if(first==1)
			{
				Predicate<Integer> e1=no->no%2==0;
				if(e1.test(second))
				{
					System.out.println("Number is Even..");
				}
				else
				{
					System.out.println("Number is not Even..");
				}
			}
			else if(first==2)
			{
				Predicate<Integer> e2=no->no%2!=0;
				if(e2.test(second))
				{
					System.out.println("Number is Odd..");
				}
				else
				{
					System.out.println("Number is not Odd..");
				}
			}
			else if(first==3)
			{
				Predicate<Integer> e3=no2->{
					int num=no2,sum=0;
					while(num>0)
					{
						int temp=num%10;
						sum=sum+(temp*temp*temp);
						num=num/10;
					}
					if(no2==sum)
						return true;
					else
						return false;
				};
				
				if(e3.test(second))
				{
					System.out.println("Number is ArmStrong..");
				}
				else
				{
					System.out.println("Number is not ArmStrong...");
				}

			}
			else
			{
				Predicate<Integer> e4=no2->{
					int num=no2,rev=0;
					while(num>0)
					{
						int temp=num%10;
						rev=rev*10+temp;
						num=num/10;
					}
					if(no2==rev)
						return true;
					else
						return false;
				};
				
				if(e4.test(second))
				{
					System.out.println("Number is Palindrome..");
				}
				else
				{
					System.out.println("Number is not Palindrome...");
				}

			}

		}
	}
}
