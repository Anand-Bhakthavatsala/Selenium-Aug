package OOPs;

import OOPs.Parent;

public class Child extends Parent implements Interface1 {
	
	public String childschool = super.school;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		System.out.println(p.rollno); //expected 
		p.city();
		Child c = new Child();
		System.out.println(c.childschool);
		c.display();
	}
	//Interface is used to declare methods and to achieve multilple inheritance, we use interface
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Calling display method");
	}

}
