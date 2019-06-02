package dataTypesandVariables;

public class LogicalOperators {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		
		if (a>b && a>c)
		{
			System.out.println("a is greatest");
		} 
		else
		{
			if(b<c)
			System.out.println("a is not greatest and b greater");
		}
		
	if (a>b || a>c)
		 System.out.println("a is bigger than either b or c");
	else
		System.out.println("a is smallest");
		// TODO Auto-generated method stub
	}
	}


