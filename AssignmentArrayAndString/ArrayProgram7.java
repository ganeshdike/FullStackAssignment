//You are given a sequence of Character in the form of Array. Now you have to put all vowels and consonants together in the array.

package AssignmentArrayAndString;

public class ArrayProgram7 
{
	public void sortArray(char arr[])
	{
		char temp;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
			}
		}
        for(char k:arr)
        	System.out.println(k);
	}
	public static void main(String[] args) {
		ArrayProgram7 program=new ArrayProgram7();
		char arr[]={'a','c','g','e','z','d','i','s'};
		program.sortArray(arr);
		
	}
}
