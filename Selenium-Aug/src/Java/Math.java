package Java;

public class Math extends Addition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math m = new Math();
		m.sum(10, 20);		

	}
	
	void sum(int a, int b) //method overriding
	{
		System.out.println("Sum of a & b: "+(a*b));
	}
	

}
