package interfacexample;

public interface SecondInter2 
{
	default void method1()
	 {
		 System.out.println("this is menthod of Second interface");
	 }
	 
	 static void method2()
	 {
		 System.out.println("this is static extra method");
	 }
	}

