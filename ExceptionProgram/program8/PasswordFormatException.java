package ExceptionProgram.program8;

public class PasswordFormatException extends RuntimeException{
	public PasswordFormatException(String s)
	{
		super(s);
	}
}
