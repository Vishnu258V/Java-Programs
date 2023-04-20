package com.MAP;

import java.util.TreeMap;

class PartyDetails implements Comparable<PartyDetails> {
	private String FirstName;
	private String LastName;
	private int PartyId;
	private int age;
	private double Amount;

	public PartyDetails(String firstName, String lastName, int partyId, int age, double Amount) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.PartyId = partyId;
		this.age = age;
		this.Amount = Amount;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getPartyId() {
		return PartyId;
	}

	public int getAge() {
		return age;
	}

	public double getAmount() {
		return Amount;
	}

	public void setPartyId(int partyId) {
		PartyId = partyId;
	}

	@Override
	public String toString() {
		return "PartyData of Id -" + PartyId + "\n------------\nFirstName=" + FirstName + " \nLastName=" + LastName
				+ " \nPartyId=" + PartyId + " \nage=" + age + " \nAmount=" + Amount + "";
	}

	// to get the details by Sorted ID Format
	@Override
	public int compareTo(PartyDetails o) {

		return this.PartyId - o.PartyId;
	}

}

public class PartySorting {
	public static void main(String[] args) {

		PartyDetails p1 = new PartyDetails("Vishnu", "vi", 1046, 22, 55630.45d);
		PartyDetails p2 = new PartyDetails("Anji", "A", 1047, 25, 45891.123);
		PartyDetails p3 = new PartyDetails("Rohan", "Bagde", 1057, 24, 65046.123);
		PartyDetails p4 = new PartyDetails("Pavan", "Kumar", 1042, 23, 55630.45d);
		PartyDetails p5 = new PartyDetails("Shiva", "A", 1049, 25, 45891.123);
		PartyDetails p6 = new PartyDetails("Vishnu", "v", 1050, 21, 65046.123);

		TreeMap<Integer, PartyDetails> map1 = new TreeMap<>();
		map1.put(p2.getPartyId(), p2);
		map1.put(p1.getPartyId(), p1);
		map1.put(p3.getPartyId(), p3);
		map1.put(p5.getPartyId(), p5);
		map1.put(p4.getPartyId(), p4);
		map1.put(p6.getPartyId(), p6);

		// we will get the details by Sorted ID Format
		for (Integer i : map1.keySet()) {
			System.out.println("\n" + map1.get(i));
		}

	}

}
