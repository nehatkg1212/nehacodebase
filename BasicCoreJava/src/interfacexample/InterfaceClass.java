package interfacexample;

public class InterfaceClass implements InterfaceFront
{

	@Override
	public void abc() 
	{
			System.out.println("This class will have the logic");
	}
	public static void main(String args[])
	{
		
		InterfaceFront it = new InterfaceClass();
		it.abc();
		System.out.println(a);
	}
	
	

}
