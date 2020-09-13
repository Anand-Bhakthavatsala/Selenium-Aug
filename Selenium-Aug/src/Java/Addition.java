package Java;

public class Addition extends AbstractExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		add.sum(10, 20);
		add.sum(20.3, 4);
	}
	
	void sum(int a, int b) //method overloading
	{
		System.out.println("Sum of a & b: "+(a+b));
	}
	
	void sum(float a, int b) //method overloading
	{
		System.out.println("Sum of a & b: "+(a+b));
	}
	
	void sum(double a, long b) //method overloading
	{
		System.out.println("Sum of a & b: "+(a+b));
	}

	@Override
	void mul() {
		
		
		
	}

}
