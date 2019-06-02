package conditionalStatements;

public class nestedif {

	public static void main(String[] args)
	{
		boolean login=true;
		if(login)
		{
			System.out.println("login passed successfully");
			boolean logodisplayed=false;
			if(logodisplayed)
			{
				System.out.println("correct logo displayed");
			}
			else {
				System.out.println("home page isnot displayed correctly");
			}
		}
		else
		{
			System.out.println("login failed");
		}
		// TODO Auto-generated method stub

	}

}
