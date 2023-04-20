package collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_4 {

	public static void main(String[] args) throws Exception {

		List<String> inte = new ArrayList<>();
		inte.add("10");
		inte.add("20");
		inte.add("30");
		inte.add("40");
		inte.add("50");

		for (String li : inte) {
			System.out.println(li);
		}

		List<String> cha = new ArrayList<>();
		cha.add("namaskaram");
		cha.add("Byee");
		cha.add(null);
		cha.add("Hii");
		cha.add("Hello");

		// Exception Handling
		try {

			Collections.sort(cha);

		} catch (Exception e) {

			e.printStackTrace();
		}
		inte.addAll(cha);

		for (String li : inte) {
			System.out.println(li);
		}

	}
}
