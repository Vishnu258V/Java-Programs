package com.MAP;

import java.util.HashMap;
import java.util.Map;

class PartyData {
	private String FirstName;
	private String LastName;
	private int PartyId;
	private int age;
	private double Amount;

	public PartyData(String firstName, String lastName, int partyId, int age, double Amount) {
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
		return "PartyData-> \nFirstName=" + FirstName + " \nLastName=" + LastName + " \nPartyId=" + PartyId + " \nage="
				+ age + " \nAmount=" + Amount + "";
	}

}

class PartyUnofficial {

	private String MaritalStatus;
	private String gender;
	private String dob;

	public PartyUnofficial(String maritalStatus, String gender, String dob) {
		MaritalStatus = maritalStatus;
		this.gender = gender;
		this.dob = dob;
	}

	public String getMaritalStatus() {
		return MaritalStatus;
	}

	public String getGender() {
		return gender;
	}

	public String getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "\nMaritalStatus=" + MaritalStatus + "\ngender=" + gender + "\ndob=" + dob + "";
	}

}


public class Party {
	public static void main(String[] args) {

		PartyUnofficial u1 = new PartyUnofficial("Unmarried", "Male", "23112000");
		PartyUnofficial u2 = new PartyUnofficial("Married", "Male", "13/10/1997");

		PartyData p1 = new PartyData("Vishnu", "Kumar", 1046, 22, 55630.45d);
		PartyData p2 = new PartyData("Anji", "A", 1047, 25, 45891.123);
		PartyData p3 = new PartyData("Rohan", "Bagde", 1057, 24, 65046.123);

		HashMap<Integer, PartyData> map1 = new HashMap<>();
		map1.put(p2.getPartyId(), p2);
		map1.put(p1.getPartyId(), p1);
		map1.put(p3.getPartyId(), p3);

		for (Integer i : map1.keySet()) {
			System.out.println("\n" + map1.get(i));
		}

		HashMap<PartyData, PartyUnofficial> map2 = new HashMap<>();
		map2.put(p1, u1);
		map2.put(p2, u2);

		for (Map.Entry<PartyData,PartyUnofficial> st : map2.entrySet()) {
			
			System.out.println(st.getValue() +"\n"+st.getKey());
		}

	}

}
