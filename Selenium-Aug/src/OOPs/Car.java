package OOPs;

public class Car {
	
	//variables
	static String brand,color;
	int gear, speed, make,doors,mil;
	String transmission;
	
	public void mileage() //method or function without parameter ->method overloading
	{
		mil=25;
		System.out.println(mil);
	}
	
	public int mileage(int m) //method or function with parameter ->method overloading
	{
		mil=m;
		//System.out.println(mil);
		return mil;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(); //c object of the Car class 
		color="White";
		
		c.brand="Toyota";
		System.out.println(c.brand);
		System.out.println(c.color);
		
		c.gear=5;
		System.out.println(c.gear);
		
		c.mileage(); //method without parameter
		
		c.mileage(100); //method with parameter

	}

}
