package conditionalStatements;

public class SwitchStatementEx {

	public static void main(String[] args) 
	{
		String day="4";
		String dayString;
		
		switch(day)
		{
		case "1":
			dayString="Monday";
			break;
		case "2":
			dayString="Tuesday";
			break;	
		case "3":
			dayString="Wednesday";
			break;
		default:
			dayString="Invalid day of week.";
			break;
		case "4":
			dayString="thursday";
			break;
		case "5":
			dayString="Friday";
			break;
		case "6":
			dayString="Saturday";
			break;
		case "7":
			dayString="Sunday";
			break;
		
				
		}
		System.out.println(dayString);

	}

}
