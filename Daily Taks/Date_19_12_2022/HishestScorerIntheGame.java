package Date_19_12_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ScoresOfPlayers {

	private String name;
	private int score;

	public ScoresOfPlayers(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {

		return "\nName - " + getName() + ",Score - " + getScore();

	}

}

public class HishestScorerIntheGame {
	public static void main(String[] args) {

		ScoresOfPlayers s1 = new ScoresOfPlayers("A", 98);
		ScoresOfPlayers s2 = new ScoresOfPlayers("B", 98);
		ScoresOfPlayers s3 = new ScoresOfPlayers("C", 21);
		ScoresOfPlayers s4 = new ScoresOfPlayers("D", 95);
		ScoresOfPlayers s5 = new ScoresOfPlayers("E", 85);
		ScoresOfPlayers s6 = new ScoresOfPlayers("F", 46);
		ScoresOfPlayers s7 = new ScoresOfPlayers("G", 30);

		ArrayList<ScoresOfPlayers> arr1 = new ArrayList<>();
		arr1.add(s7);
		arr1.add(s6);
		arr1.add(s5);
		arr1.add(s4);
		arr1.add(s3);
		arr1.add(s2);
		arr1.add(s1);
		Comparator<ScoresOfPlayers> cmp2 = Comparator.comparing(ScoresOfPlayers::getName);
		Collections.sort(arr1, cmp2);
		
		Comparator<ScoresOfPlayers> cmp1 = Comparator.comparing(ScoresOfPlayers::getScore);

		Collections.sort(arr1, cmp1);

		for (ScoresOfPlayers s : arr1) {
			System.out.println(s);
		}

		System.err.print("\nHighest Score of the players  - " + arr1.get(arr1.size() - 1));

	}

}
