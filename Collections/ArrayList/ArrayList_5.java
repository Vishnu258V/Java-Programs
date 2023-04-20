package collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_5 {

	public static void main(String[] args) {
	
		int[] num = {10,20,22,30,40,4548,6};
		
		List<Integer> inte = new ArrayList<>();
		for(int i : num) {
			inte.add(i);
		}

		System.out.println(inte);
		Collections.sort(inte);

		
	
		
	}

}
