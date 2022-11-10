package Java8;

import java.util.function.Consumer;

public class Program6 
{
	public static void main(String[] args) {
		 Consumer<Character> pattern = value -> {
			 	char ch='a',temp=value;
			 	while(ch<=value)
			 	{
			 		char ch2=ch;
			 		while(ch2<=value)
			 		{
			 			System.out.print(ch2++);
			 		}
			 		ch2=value;
			 		char space=value;
			 		//space--;
			 		while(space<temp)
			 		{
			 			System.out.print("  ");
			 			space++;
			 		}
			 		while(ch2>='a')
			 		{
			 			if(ch2!=temp)
			 			{
			 				System.out.print(ch2);				 			
			 			}
			 			
			 			ch2--;			 			
			 		}
			 		System.out.println();
			 		value--;			 		
			 	}
	        };

	        pattern.accept('f');
	        
	}
}
