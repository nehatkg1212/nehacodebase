package arrays;

public class Program1 
{

	public static void main(String[] args) 
	{
		Object[] arr=new Object[4];
		
		arr[0]=1;
		arr[1]="Neha";
		arr[2]=true;
		arr[3]=3.45;
		
		for(int i=arr.length;i>0;i-- )
		{
			System.out.println(arr[i-1]);
		}
		

	}

}
