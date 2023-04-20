package Date_20_12_2022;

public class ExceptionHandlingKeywords {

	public static void main(String[] args) throws Exception  {

		int a = 10;
		int b = 0;
		int c = 0;

		System.out.println("Hii ");
		
		//System.out.println(c = a / b);
//
		System.out.println("hello ");
		
		try {
			c = a / b;
		} catch (Exception e) {
			e.getCause();

		} finally {
			System.out.println("\nIt is a Arithmetic Exception");
		}
	}
}
