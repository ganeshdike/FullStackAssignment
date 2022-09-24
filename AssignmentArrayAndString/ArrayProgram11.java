//You are having array of strings. Now you have to arrange strings in array on the basis of the length of each string. Smallest string will be first and so on. 

package AssignmentArrayAndString;

public class ArrayProgram11 
{
	public void swapStringUsingLength(String arr[])
	{
		String temp="";
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].length()<arr[i].length())
                {
                	temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
			}
		}
		for(String str:arr)
		{
			System.out.print(" "+str);
		}
	}
	public static void main(String[] args) {
		ArrayProgram11 program=new ArrayProgram11();
		String arr[]={"nitin","abc","aba","kjdskgg","hfhf","asdsa","a"};
		program.swapStringUsingLength(arr);
	}
}
