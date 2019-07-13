package oops.abstraction;

public class absimplementation extends AbstractClassExample1
{

	@Override
	public void abstractmethod() 
	{
		System.out.println("this is some test i dont understand");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[])
	{
		AbstractClassExample1 a1=new absimplementation();
		a1.abstractmethod();
		a1.nonabstractmethod();
		
	}
	
}
