package interfacexample;

public class ImplementofMulInherit implements SecondInter1, SecondInter2 
{

	public static void main(String[] args) 
	{
		
		SecondInter1 ab=new ImplementofMulInherit();
		ab.method1();
	}

	@Override
	public void method1() 
	{
		// TODO Auto-generated method stub
		SecondInter2.super.method1();
		SecondInter1.super.method1();
	}

}
