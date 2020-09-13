package Java;

public class Demo1 {

	public static void main(String[] args) {
		
		// Primitive data types
		System.out.println("Welcome to Java\n");
		System.out.println(100);
		int num1=(int) 10,num2=200; //4 bytes 1 byte-> 8bits
		System.out.println(num1);
		double pi=3.1415; //8 bytes
		float f = (float) 12.34; //4 bytes of decimal values
		System.out.println(pi+f);
		long l= 2147483; //8 bytes whole number
		short s = -32768;//2 bytes
		char c = '1';
		boolean b = false;
		
		System.out.println(l+"\n"+s+"\n"+c+"\n"+b);
		System.out.println("Addition of num1 & num2 "+ (num1+num2+l));
		
		String s1 = "I am new to Selenium";
		String s2 = " Interesting";
		
		System.out.println(s1.concat(s2));
		
		System.out.println("Addition of pi & f "+(pi+f));
		System.out.println("Subtraction of pi & f "+(f-pi));
		System.out.println("Multiplication of pi & f "+(f*pi));
		System.out.println("Division of pi & f "+(pi/f));
		int x=11,y=2;
		System.out.println("Modulus of a & b "+(x%y));
		System.out.println(++x); //pre increment -> x=x+1
		System.out.println(x++); //post increment -> It will print the value of x & then increment
		System.out.println(x);
		
		System.out.println(--y);//pre decrement
		System.out.println(++y);//pre increment
		System.out.println(y--); //post decrement
		System.out.println(y);
	}

}
