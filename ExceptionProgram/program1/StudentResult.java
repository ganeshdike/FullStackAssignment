package ExceptionProgram.program1;

public class StudentResult {

	private int math;
	private int java;
	private int c;
	private int python;
	public StudentResult(int math, int java, int c, int python) {
		super();
		this.math = math;
		this.java = java;
		this.c = c;
		this.python = python;
	}
	public StudentResult() {
		// TODO Auto-generated constructor stub
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math<0)
		{
			throw new NegativeMarks("You Enter -ve Marks ");
		}
		else
		{
			this.math = math;
		}
		
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		if(java<0)
		{
			throw new NegativeMarks("You Enter -ve Marks ");
		}
		else
		{
			this.java = java;
		}
		
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		if(c<0)
		{
			throw new NegativeMarks("You Enter -ve Marks ");
		}
		else
		{
			this.c = c;
		}
		
	}
	public int getPython() {
		return python;
	}
	public void setPython(int python) {
		if(python<0)
		{
			throw new NegativeMarks("You Enter -ve Marks ");
		}
		else
		{
			this.python = python;
		}
		
	}
	@Override
	public String toString() {
		return "StudentResult [math=" + math + ", java=" + java + ", c=" + c + ", python=" + python + "]";
	}
	
	public boolean checkResult()
	{
		int subCount=0;
		if(math<40)
		{
			subCount++;
		}
		if(java<40)
		{
			subCount++;
		}
		if(c<40)
		{
			subCount++;
		}
		if(python<40)
		{
			subCount++;
		}
		if(subCount>=2)
		{
			return false;
		}
		else
			return true;
			
	}
	public boolean checkGrade()
	{
		float percentage=c+java+python+math/4;
		if(percentage<40)
		{
			return false;
		}
		else
			return true;
	}
}
