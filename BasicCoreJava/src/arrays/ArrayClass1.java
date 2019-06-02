package arrays;

public class ArrayClass1 {

	public static void main(String[] args) 
	{
		String user="Neha";
		
		String[] arr=new String[10];
		
		arr[0]="a";
		arr[1]="b";
		arr[2]="c";
		arr[3]="a";
		arr[4]="d";
		arr[5]="e";
		arr[6]="f";
		arr[7]="g";
		arr[8]="h";
		arr[9]="i";
		//System.out.println(arr[3]);
		
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
			
		

	}

}
