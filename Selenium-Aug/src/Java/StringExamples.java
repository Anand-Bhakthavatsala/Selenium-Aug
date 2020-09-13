package Java;

public class StringExamples {
	
	public static void main(String[] args) {
		String name1="Java", name2="Selenium";
		System.out.println(name1.length());
		System.out.println(name2.length());
		
		System.out.println(name1.toUpperCase());
		System.out.println(name1.charAt(0));
		String name3=name1.concat(name2);
		System.out.println(name3);//concat means join
	}
}
