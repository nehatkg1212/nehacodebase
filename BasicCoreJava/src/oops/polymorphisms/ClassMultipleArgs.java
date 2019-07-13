package oops.polymorphisms;

public class ClassMultipleArgs {

	public static void main(String[] args) 
	{
		ClassMultipleArgs ab=new ClassMultipleArgs();
		ab.add(1, 2);
		ab.add(12.4, 123.5, 34.87);

	}
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b, double c)
	{
		System.out.println(a+b+c);
	}

}
