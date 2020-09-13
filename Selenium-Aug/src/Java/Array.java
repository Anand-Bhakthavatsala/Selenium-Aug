package Java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks= {9,8,10,6,7,(int) 4.5};//integer array
				
	/*	System.out.println(marks[0]);
		System.out.println(marks[5]);//6th position
*/		//Array is a collection of similar objects/data types
		String[] cars= {"Honda","Renault","Merc","Nissan"};
		
	//	System.out.println(cars[0]);
		int len = marks.length;
	//	System.out.println(cars.length);
		
		for(int i=0;i<cars.length;i++)
		{
			//System.out.println(marks[i]);
			System.out.print(cars[i]+" \n");
		}
		
	}

}
