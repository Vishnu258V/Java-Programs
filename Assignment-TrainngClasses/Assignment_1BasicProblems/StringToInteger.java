package Assignment_1BasicProblems;

public class StringToInteger {

	public static void main(String[] args) {

			String numb = "123456987";
			int i = Integer.parseInt(numb);
			
			int sum = i/10000;
			System.out.println(sum);
		
			
			
			
			StringBuffer sb1 = new StringBuffer(numb);
			System.out.println(sb1);
			String b = sb1.toString();
			
			int i2=  Integer.parseInt(b);
			
			// just to check its working as number or string
			int total = i2/10000;
			System.out.println(total);

		
			
	}
}
