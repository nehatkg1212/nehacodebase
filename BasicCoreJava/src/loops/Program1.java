package loops;

public class Program1 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

		for(int l=1;l<=4;l++)
		{
			for(int k=1; k<=l; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int l=1;l<=4;l++)
		{
			for(int k=1; k<=l; k++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		int y;
		{
			for(int x=1;x<=4;x++)
			{
				
				for(y=x;y<4;y++)
				{
					System.out.print(" ");
				}
				for(int z=1;z<=x;z++)
				{
						
					System.out.print("& ");
						
				}
				System.out.println();
			}
		}
					
	}
				
				
}
			
			
		
		
	


