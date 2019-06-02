package conditionalStatements;

public class ConditionalStatement1 {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b)
		{
			System.out.println("a is greatert than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		// TODO Auto-generated method stub

		if(a>b)
		{
		System.out.println("a is greater than b");
		}else if(a>c)
		{System.out.println("a is greater than c");}
		else
		{System.out.println("a is smaller or equat to other 2");
	}

}
}
