package ExceptionProgram.program2;

public class LeaveExceedLimitException extends RuntimeException
{
	public LeaveExceedLimitException(String msg)
	{
		super(msg);
	}
}
