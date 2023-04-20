package JavaExam1;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePairHasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. To check given key-value pair whether its available are not I will you the
		// methods isContainskey(), isContainsvalue(). For example I have a Hasmap
		HashMap<Integer, Integer> map = new HashMap<>();
		// to check given key value
		// it will either true or false according to the key presence
		System.out.println(map.containsKey(10));

		if ((!map.containsKey(10))) {
			map.put(10, 10);
		}

		// to check given value
		System.out.println(map.containsValue(map.get(20))); // it will either true or false according to the
															// valuepresence

		// based on the above conditions I am going to add the key value pair if not
		// available in the HashMap
		if (!(map.containsKey(20)) && !(map.containsValue(map.get(20)))) {
			map.put(20, 20);
		}

		// 2. To retrieve a value associated with a given key from the HashMap I will
		// use the following method
		map.get(10); // it gives the value for the particular key
		// 3. To retrieve the all the keys present in the map
		for (int i : map.keySet()) {
			System.out.println(i); // it only key values present In the map
		}
		//4. To remove key-value pair only if its available in the HashMap
		if (map.containsKey(10)) {
			map.remove(10);
		} else {
			System.out.println("Key value pair not available  ");
		}

		for (int i : map.keySet()) {
			System.out.println(i + " = " + map.get(i));
		}

	}

}
