package OOPs;

public class BMW extends Car {
	
	
	public void mileage() //method or function without parameter ->method overriding
	{
		int mil=100;
		System.out.println(mil);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW car1 = new BMW(); //Class <obj name> = new Class();
		car1.doors=2;
		System.out.println(car1.doors);
		
		int mil = car1.mileage(50);
		System.out.println(mil);
		
		car1.mileage();
		Car c = new Car();
		c.mileage();
		
	}

}
