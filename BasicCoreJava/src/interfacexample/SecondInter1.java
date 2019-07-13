package interfacexample;

public interface SecondInter1 
{
 default void method1()
 {
	 System.out.println("this is menthod of first interface");
 }
 
 static void method2()
 {
	 System.out.println("this is static extra method");
 }
}
