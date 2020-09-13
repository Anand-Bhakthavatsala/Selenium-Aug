package Java;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);*/
		
		for(int num=1;num<=10;num++) //(initialize;condition;increment/decrement)
		{
			System.out.println(num);
			try {
				Thread.sleep(2000);//2 seconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000 milliseconds-> 1 sec
		}

	}

}

