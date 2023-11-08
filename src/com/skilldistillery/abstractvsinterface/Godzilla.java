package com.skilldistillery.abstractvsinterface;

import java.util.Objects;

//public abstract class Godzilla extends MonsterFightMoves {

//public abstract class Godzilla implements HumanFriends{

public abstract class Godzilla extends MonsterFightMoves implements HumanFriends {

//	static String staticName = "Godzilla";//Static Example
//	protected String protectedName = "Godzilla";//Protected Example
//	public final String FINALNAME = "Godzilla";//Final Example
//	String name = "Godzilla";//Non-Static Example
//	private String privateName = "Godzilla";//Private Example
	private String name = "Godzilla";
	private int power = 5_000_000;

	public Godzilla() {
	}

	public Godzilla(String name, int power) {
		this.name = name;
		this.power = power;
	}

	public abstract void invade();

	public abstract void charge();

	public abstract void breathFire();

	public abstract void roar();

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Godzilla [name=" + name + ", power=" + power + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, power);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Godzilla other = (Godzilla) obj;
		return Objects.equals(name, other.name) && power == other.power;
	}
}
