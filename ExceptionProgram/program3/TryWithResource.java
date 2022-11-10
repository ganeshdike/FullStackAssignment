package ExceptionProgram.program3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource 
{
	public static void main(String[] args) throws IOException 
	{
	    BufferedReader br=null;
	    String line;
	    try
	    {
	    	System.out.println("Entering try block");
	    	br=new BufferedReader(new FileReader("C:/Users/ganesh.dike/Documents/Object_and_Class_Assignment.txt"));
	    	while((line = br.readLine())!= null)
	    	{
	    		System.out.println("Line =>"+line);
	    	}
	    } 
	    catch(IOException e)
	    {
	    	System.out.println("IOException in try block =>" + e.getMessage());
	    } 
	    finally 
	    {
	    	System.out.println("Entering finally block");
	    	br.close();
	        
	    }
	    
	}
}
