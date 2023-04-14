package com.bldea.crorepati.package1;

public class Candidate {
	private String name;
	private int age;
	private String City;
	private String state;
	private static int amount;
	/**
	 * @param name
	 * @param age
	 * @param city
	 * @param state
	 */
	public Candidate(String name, int age, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.City = city;
		this.state = state;
	}
	
	/**
	 * @param amount the amount to set
	 * @return 
	 */
	public static void setAmount(int amt) {
		amount = amt;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	
	

}
