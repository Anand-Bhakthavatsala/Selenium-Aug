package Java;

public class IfCondition {

	public static void main(String[] args) {
		
		int num1=75,num2=89;
		
			
	//	System.out.println(num1<num2);//>-> greater than relational operator
		
		if(num1>num2) //1st if condition
		{
			System.out.println(num1 +" is greater than "+num2);
			System.out.println("We are inside the if condition");
		}
		else if(num1==num2)//2nd if condition
		{
			System.out.println(num1 +" equal "+num2);
			System.out.println("We are inside the else if condition");
		}
		
		System.out.println("We are out of if condition");
		
		String today = "thursday";
		
		if(today.equals("Monday"))
		{
			System.out.println("Today is Monday");
		}
		else if (today.equals("Tuesday"))
		{
			System.out.println("Today is Tuesday");
		}
		else if (today.equalsIgnoreCase("THurSDAY")) //if true
		{
			System.out.println("Today is Thursday");
		}
		else
			System.out.println("None of the above");
	
	}

}
