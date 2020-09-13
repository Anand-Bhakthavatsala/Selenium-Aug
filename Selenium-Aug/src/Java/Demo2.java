package Java;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to Java");
		System.out.println(100);
		
		int num1=10,num2=200; //4 bytes 1 byte-> 8bits
		System.out.println(num1);
		
		System.out.println(++num2);//pre increment
		System.out.println(num2++);//post increment
		System.out.println(num2);
		
		boolean num3;
		num3 = num1<num2; //is 10<202
		System.out.println("Result of num3: "+num3);
		System.out.println("Result of greater than or equal to: "+(num1>=num2));
		
		float d1= (float) 11, d2 = (float) 11.0;
		long d3 = 11; //it will hold decimal values
		System.out.println(d3);
		
		System.out.println(d1==d2);
		
		System.out.println(d1!=d2);//is 10.5!=11
	}

}
