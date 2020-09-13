package Java;

public abstract class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	AbstractExample ae = new AbstractExample();
		cricket(10,15);
		squash(23,345);
	}
	
	static void cricket(int a, int b) {
		System.out.println("Sum method "+(a+b));
	} //no implementation details
	
	static void squash(int a, int b)
	{
		//System.out.println("Subtraction"+(a-b));
		int x;
		x=a-b;//10-15
		System.out.println("Result of a -b is : "+x);
		
	}
	
	abstract void snooker(); 
	

}
