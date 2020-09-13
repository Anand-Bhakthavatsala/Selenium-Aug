package Java;

import OOPs.Parent;

public class Child extends Parent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		System.out.println(p.rollno); //expected 
		p.city();
	}

}
