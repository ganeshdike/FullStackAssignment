//WAP to store all Collection elements in Array and perform the Binary Search

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Program2
{
	public void createSorted(int a[], int n)
	{
	    Vector<Integer> b = new Vector<>();
	    for(int j=0;j<n;j++)
	    {
	       	if (b.isEmpty())
	       	{
	       		b.add(a[j]);
	       	}   
	        else
	        {
	            int start=0,end=b.size()-1;
	            int pos=0;
	            while(start<=end)
	            {
	                int mid=start+(end-start)/2;
	                if (b.get(mid)==a[j])
	                {
	                    b.add((Math.max(0,mid+1)),a[j]);
	                    break;
	                }
	                else if(b.get(mid)>a[j])
	                    pos=end=mid-1;
	                else
	                    pos=start=mid+1;
	                if(start>end)
	                {
	                    pos=start;
	                    b.add(Math.max(0,pos),a[j]);
	                    break;
	                }
	            }
	        }
	    }
	    for (int i = 0; i < n; i++)
	        System.out.print(b.get(i) + " ");
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(5);
		int arr[]=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
		Program2 program2=new Program2();
		program2.createSorted(arr,arr.length);
	}
}
