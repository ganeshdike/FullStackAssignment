//Suppose that you are having an array of size N. now your task is to sort the half array that is from 0 to N/2 in ascending order and N/2+1 to N in descending order. 

package AssignmentArrayAndString;

public class ArrayProgram5 
{
	public void sortArray(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length/2;j++)
			{
				if(arr[j]<arr[i])
                {
                	temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
			}
			if(i>=arr.length/2)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]>arr[i])
	                {
	                	temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
				}
			}
		}
        for(int k:arr)
        	System.out.println(k);
	}
	public static void main(String[] args) {
		ArrayProgram5 program=new ArrayProgram5();
		int arr[]={1,6,28,21,11,5,32,2,67,3,99,8};
		program.sortArray(arr);
		
	}
}
