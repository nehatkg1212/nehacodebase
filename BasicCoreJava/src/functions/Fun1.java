package functions;

public class Fun1 
{

	public static void main(String[] args) 
	{
		int add=sum(10,24);
		int add2=sum(21,76);
		
		Fun1 ref=new Fun1();
		//message("Neha");
		ref.message("my first message");
		
		System.out.println(add);
		System.out.println(add2);
		System.out.println(add+add2);
			
	}
	
	public static int sum(int a, int b)
	{
		
		int c=a+b;
		//System.out.println(c);
		return c;
	}
	public void message(String message)
	{
		System.out.println("your mssage "+ message);
	}

}
