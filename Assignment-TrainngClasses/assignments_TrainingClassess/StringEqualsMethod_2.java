package com.StringManipulation.Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringEqualsMethod_2 {

	public static void main(String[] args) {

		// Strings --> Immutable
		String s1 = "Vishnu";
		String s7 = "Vishnu";
		String s2 = "Kumar";

		// String with new Keyword --> Immutable
		String s3 = new String("Vishnu");
		String s4 = new String("Kumar");
		String s5 = new String("Vishnu");

		// StingBuffer --> Mutable
		StringBuffer sb1 = new StringBuffer("Vishnu");
		StringBuffer sb2 = new StringBuffer("Kumar");
		StringBuffer sb3 = new StringBuffer("Vishnu");

		// StringBuilder --> Mutable
		StringBuilder sbl1 = new StringBuilder("Vishnu");
		StringBuilder sbl2 = new StringBuilder("Kumar");
		StringBuilder sbl3 = new StringBuilder("Vishnu");

		// EqualsTo Operator (==)
		boolean s1s7 = (s1 == s7);
		boolean s1s2 = (s1 == s2);

		boolean s1s3 = (s1 == s3);
		boolean s2s4 = (s2 == s4);
		boolean s3s5 = (s3 == s5);
		boolean s5s4 = (s5 == s4);

		// boolean s1sb1 = (s1 == sb1); // Incompatible operand types StringBuffer and
		// StringBuilder
		boolean sb1sb3 = (sb1 == sb3);
		boolean sb1sb2 = (sb1 == sb2);
		// boolean s3sb1 = (s3 == sb1); // Incompatible operand types StringBuffer and
		// StringBuilder

		// boolean s1sbl1 = (s1 == sbl1); // Incompatible operand types StringBuffer and
		// StringBuilder
		// boolean s3sbl1 = (s3 == sbl1); // Incompatible operand types StringBuffer and
		// StringBuilder
		boolean sbl1sbl3 = (sbl1 == sbl3);
		// boolean sb1sbl1 = (sb1 == sbl1); // Incompatible operand types StringBuffer
		// and StringBuilder

		// equals(); method
		boolean s1sb1_2 = (s1.contentEquals(sb1));
		boolean s3sb1_2 = (s3.contentEquals(sb1)); // if we compare string with String builder it will check reference
													// only
													// so that it will give false even if its content same
		boolean s1sbl1_2 = (s1.contentEquals(sbl1));
		boolean s3sbl1_2 = (s3.equals(sbl1));
		boolean sb1sbl1_2 = (sb1.equals(sbl1));

		Map<String, Boolean> values = new HashMap<String, Boolean>();

		values.put("s1s7 ", s1s7);
		values.put("s1s2 ", s1s2);
		values.put("s1s3", s1s3);
		values.put("s2s4 ", s2s4);
		values.put("s3s5 ", s3s5);
		values.put("s5s4 ", s5s4);
		values.put("sb1sb3 ", sb1sb3);
		values.put("sb1sb2 ", sb1sb2);
		values.put("sbl1sbl3 ", sbl1sbl3);
		values.put("s1sb1_2 ", s1sb1_2);
		values.put("s3sb1_2 ", s3sb1_2);
		values.put("s1sbl1_2 ", s1sbl1_2);
		values.put("s3sbl1_2 ", s3sbl1_2);
		values.put("sb1sbl1_2 ", sb1sbl1_2);

		Set setlist = values.entrySet();

		Iterator<Set> itr = setlist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\n");

		for (Map.Entry m : values.entrySet()) {
			System.out.println(m.getKey() + "=" + m.getValue());
		}

	}
}
