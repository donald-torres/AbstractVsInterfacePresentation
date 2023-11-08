package com.skilldistillery.abstractvsinterface;

public class TokyoDefenseForce extends Godzilla implements MechaGodzilla {

	public TokyoDefenseForce() {
	}

	public TokyoDefenseForce(String name, int power) {
		super(name, power);
	}

	@Override
	public void invade() {
		System.out.println("Godzilla is entering to Japan");

	}

	public void invade(String name) {
		System.out.println("OMG IT'S " + name + "!!!");
	}

	public void activate() {// Static method from ApexCybernetic Interface
		System.out.println("Godzilla detected activating Mechagodzilla");
	}

	public void fight() {// Static method from ApexCybernetic Interface
		System.out.println("MechaGodzilla - Intercepting Gozilla to eliminate");
	}

	@Override
	public void createFire() {// MechaGodzilla method
		System.out.println("MechaGodzilla - Spews fire");
	}

	@Override
	public void roarSound() {// MechaGodzilla method
		System.out.println("MechaGodzilla - Electronic RARRRRR");
	}

	public void punch(String punch) {// non-abstract(concrete) method from Abstract Class
		System.out.println(punch);
	}

	public void tailSwipe(String tailSwipe) {// non-abstract(concrete) method from Abstract Class
		System.out.println(tailSwipe);
	}

	@Override
	public void numberOfFriends() {// Functional Interface method
		System.out.println("Just one");
	}

	@Override
	public void charge() {// Abstract method from Abstract class
		System.out.println("Godzilla - Charging breath...");
	}

	@Override
	public void breathFire() {// Abstract method from Abstract class
		System.out.println("Godzilla - Breath Fire!!!");
	}

	@Override
	public void roar() {// Abstract method from Abstract class
		System.out.println("Godzilla - RARRRRR");
	}

	public void win() {
		String winner;
		winner = this.getPower() > MechaGodzilla.power ? "Godzilla" : "MechaGodzilla";
		System.out.println(winner + " Wins!!!");
	}

//		Godzilla godzilla = new Godzilla(); //cannot instantiate an abstract class

}
