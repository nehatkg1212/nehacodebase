package stringClass;

public class ClassFunctions {

	public static void main(String[] args) 
	{
		String s1="My name is neha jayaswal";
		
		int len=s1.length();
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			System.out.println(s1.charAt(i));
		}
		boolean check=s1.contains("jayaswal");
		System.out.println(s1.substring(11));
		System.out.println(s1.substring(11,15));
		System.out.println(s1.equals("neha"));
		System.out.println(s1.contains("neha"));
		System.out.println(check);
		String date=String.join("/","06","22","2019");
		System.out.println(date);
		
		String[] split=s1.split(" ");
		for(int i=0; i<split.length; i++)
		{
			System.out.println(split[i]);
		}
		
		for(String s3:split)
		{
			System.out.print(s3);
		}
		System.out.println();
		System.out.println(s1.indexOf("neha"));
		System.out.println(s1.indexOf("NeHa"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.indexOf("a",5));
		
		System.out.println(s1.replace("neha", "Neha"));
		System.out.println(s1.indexOf("Neha"));
		
		System.out.println(s1.toLowerCase());
		//System.out.println(s1.toUpperCase());
		s1=s1.toUpperCase();
		System.out.println(s1);
		s1.trim();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
