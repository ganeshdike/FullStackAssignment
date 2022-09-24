//WAP to print the number of alphabets repeated in the given string.
package AssignmentArrayAndString;

import java.util.Scanner;

public class Program4 {

	public void printRepeatedChar(String first)
	{
		char arr[]=first.toCharArray();
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			char ch=arr[i];
			count=1;
			if(ch!=' ')
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(ch==arr[j])
					{
						count++;
						arr[j]=' ';
					}
				}
				System.out.println(ch+" :"+count);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String:");
		String first=scanner.nextLine();
		Program4 program4=new Program4();
		program4.printRepeatedChar(first);
		
	}
}
