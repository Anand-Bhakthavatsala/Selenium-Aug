package Java;

public class SwitchCondition {
	
	public static void main(String[] args) {
		
		String month="Feb";
		
		switch(month) 
		{
		case "September":
			System.out.println("9 is a September month");
			break;
		case "December":
			System.out.println("12 is a December month");
			break;
		case "January":
			System.out.println("1 is a January month");
			break;
		default:
			System.out.println("Appropriate month is printed on the console output");
		}
	}

}
