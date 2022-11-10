package ExceptionProgram.program1;

public class MainStudent
{
	public static void main(String[] args) {
		StudentResult result=new StudentResult();
		result.setC(55);
		result.setJava(86);
		result.setMath(45);
		result.setPython(23);
		
		Student student=new Student(1, "ganesh", "pune", result);
		
		if(student.getSrobj().checkResult())
		{
			System.out.println("Grade Pass");
			System.out.println(student);
		}
		else if(student.getSrobj().checkGrade())
		{
			throw new  ResultException(student.getSname()+" You Are failed");
		}
		else
		{
			throw new ResultException(student.getSname()+" You Are failed");
		}
	}
}
