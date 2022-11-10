package ExceptionProgram.program2;

public class EmployeeAbscondingException extends RuntimeException
{
	public EmployeeAbscondingException(String msg){
		super(msg);
	}
}
