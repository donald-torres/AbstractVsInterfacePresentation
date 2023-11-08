package com.skilldistillery.app;

import com.skilldistillery.abstractvsinterface.MechaGodzilla;
import com.skilldistillery.abstractvsinterface.TokyoDefenseForce;

public class Japan {

	public static void main(String[] args) {
		Japan japan = new Japan();
		japan.run();
	}

	public void run() {
		TokyoDefenseForce tdf = new TokyoDefenseForce();
		tdf.invade();
		tdf.invade(tdf.getName());
		tdf.activate();
		tdf.invade(MechaGodzilla.name);
		tdf.fight();
		tdf.punch();
		tdf.createFire();
		tdf.tailSwipe();
		tdf.roarSound();
		tdf.roar();
		tdf.charge();
		tdf.breathFire();
		tdf.win();

	}

}
