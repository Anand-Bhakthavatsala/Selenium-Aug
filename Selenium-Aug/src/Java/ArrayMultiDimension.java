package Java;

public class ArrayMultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][]= {{10,20,30,40,45},{50,60,70,80,90}};//Two dimensional array int
		int dim = num.length;
		System.out.println(dim);
	//	System.out.println(num[1][0]);//num[0][1]-> 20 this is not code optimization
		
		for(int i=0;i<dim;i++) //ctr+shift+/  to comment
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(num[i][j]+ " ");//num[0][0] ->10
			}
			System.out.println();
		}
		

	}

}
