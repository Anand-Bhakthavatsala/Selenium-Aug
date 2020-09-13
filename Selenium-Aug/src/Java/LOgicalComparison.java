package Java;

public class LOgicalComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10,y=10;
		boolean z;
		System.out.println(((x >= y) || (x == y))); // (true OR true)
		
		z=((x < y) && (x <= y)); //logical AND	(false AND true)	
		System.out.println(z);
		
		x+=x;//x=x+x;
		System.out.println(x);
		
		String a=(y%2==0)?"Even":"Odd";
		System.out.println(a);
		
	/*	int number=13; 
		int j=number>10?1:2;
		System.out.println(j);
		String output = (number%2==0)?"Even":"odd";
		System.out.println(output);*/

		int number=13; 
		String j=number>10?"True":"false"; //13>10 is 1
		
		System.out.println("values of j "+j);

	}

}
