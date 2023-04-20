package Date_19_12_2022;

import java.util.HashMap;
import java.util.Map;

class check {

	public void word0() {
		String[] strings = { "Vishnu", "Anji", "Rohan" };
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s : strings) {
			map.put(s, 0);

		}
		System.out.println(map);
	}

	public void wordLen() {

		String[] strings = { "Vishnu", "Anji", "Rohan" };

		HashMap<String, Integer> h1 = new HashMap<>();

		for (String s : strings) {
			h1.put(s, s.length());
		}

		System.out.println(h1);

	}
	/*
	 * pairs(["code", "bug"]) → {"b": "g", "c": "e"} pairs(["man", "moon",
	 * "main"]){"m": "n"} pairs(["man", "moon", "good", "night"]) → {"g": "d", "m":
	 * "n","n": "t"}
	 */

	public void FirstNdLastElemnt() {
		String[] strings = { "Vishnu", "Anji", "Rohan" };

		HashMap<Character, Character> h2 = new HashMap<>();

		for (String s : strings) {
			h2.put(s.charAt(0), s.charAt(s.length() - 1));
		}

		System.out.println(h2);
	}

}

public class HashMapElementsRetrive {

	public static void main(String[] args) {

		check c1 = new check();
		c1.word0();
		c1.wordLen();
		c1.FirstNdLastElemnt();

	}
}
