package Assignment_1BasicProblems;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		
		String s1 = "    Havi Solutions Private ltd    ";
		System.out.println("Before Trim white spaces -"+s1);
		
		s1 = s1.trim();
		s1 = s1.replace(" ", "");
		System.out.println("After Trim white spaces  -"+s1);

		
	}
}
