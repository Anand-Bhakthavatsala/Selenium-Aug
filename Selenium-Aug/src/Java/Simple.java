package Java;

class A{  
	public int data=40;  
	public void msg(){System.out.println("Hello java");}  
}  

public class Simple {
	
	double d;
	Simple() //Empty constructor
	{
		int i=100;
		System.out.println("Welcome to Simple class "+i);
	}
	
	Simple(double percentage) //constructor with double parameter
	{
		this.d = percentage;
	//	System.out.println(this.d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A obj = new A();
		System.out.println(obj.data);
		
		obj.msg();*/
		
		Simple s = new Simple();
		Simple s2 = new Simple(99.9);
	
	}

}
