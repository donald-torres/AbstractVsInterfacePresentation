package com.skilldistillery.abstractvsinterface;

//public interface MechaGodzilla extends TokyoDefenseForce{
//public interface MechaGodzilla extends Godzilla{

public interface MechaGodzilla extends ApexCybernetics {

//	final String FINALNAME = "MechaGodzilla";//Final Example
//	static String staticName = "MechaGodzilla";//Static Example
//	String defaultName = "MechaGodzilla";
	public String name = "MechaGodzilla";
	public int power = 4_500_000;

	abstract void createFire();

	public void roarSound();

}
