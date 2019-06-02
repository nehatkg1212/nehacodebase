package functions;

public class AccessModifiers
{

	public static void main(String[] args) 
	{
		
		AccessModifiers obj=new AccessModifiers();
		obj.publicmethod();
		obj.privatemethod();
		obj.noaccessmethod();
		obj.protectedmethod();
	}
	//public method
	public void publicmethod()
	{
		System.out.println("this is public method");
	}
	//private method
	private void privatemethod()
	{
		System.out.println("this is private method");
	}
	//no access modifier method
	void noaccessmethod()
	{
		System.out.println("this is no access modifier method");
	}
	//protected method
	protected void protectedmethod()
	{
		System.out.println("this is protected method");
	}

}
