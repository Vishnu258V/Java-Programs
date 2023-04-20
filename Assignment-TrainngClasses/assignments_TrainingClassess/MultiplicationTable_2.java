package assignments_TrainingClassess;
import java.util.*;


// We wanted to print the no of multiplication tables from the user input
// Even if user give inputs not in a ascending order the output has to print in ASCENDING ORDER only



class show {
	
	void function() {
		
		System.out.println("Enter the no of tables to provide");
		
		Scanner sc = new Scanner(System.in);
		int noOf = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the Nummbers to provide the ");
		
		while(noOf >0) {
			int num = sc.nextInt();
			list.add(num);	
			noOf--;
		}
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {	
			int	num = list.get(i);
		
			for (int j = 0; j <= 12; j++) {
				System.out.println(num + " * " + j + " = " + (num * j));	
			}			
		} 
	
	
	}	
}


public class MultiplicationTable_2 {

	public static void main(String[] args) {

		show s1 = new show();
		s1.function();


		
		
	}
}
