package Assignment_1BasicProblems;

public class RemoveCommonElements {

	public static void main(String[] args) {

		String s1 = "HaviSolutions";
		String s2 = "Havi";
		StringBuffer sb1 = new StringBuffer();

//		char []c1 = s1.toCharArray();
//		char []c2 = s1.toCharArray();
	    for (int i = 0; i < s1.length(); i++) {
	        int count = 0;
	        for (int j = 0; j < s2.length(); j++) {
	          if (s1.charAt(i) == s2.charAt(j)) {
	            count = 1;
	          }
	        }

	        if (count == 0)
	          sb1.append(s1.charAt(i));
	      }
	    System.out.println("String before elimination -> "+s1);
		 System.out.println("String After the elimination of same characters -> "+sb1);

	}
}
