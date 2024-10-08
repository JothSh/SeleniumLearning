package onesample;

import org.testng.annotations.Test;

public class GroupingExample {

	/*
	 * scenario : A car show room having five brands, ferrari, bmw, benz, porche, i
	 * want to run test case only for the bmw and benz
	 */
	@Test (groups = {"ferrari"})
	public void ferrari458() {
		System.out.println("Test driving ferrari");
	}
	@Test (groups = {"ferrari"},priority = 0)
	public void ferrari458italia() {
		System.out.println("Test driving ferrari");
	}
	@Test (groups = {"bmw"})
	public void bmwA6() {
		System.out.println("Test driving bwm");
	}
	@Test (groups = {"bmw"})
	public void bmwA8() {
		System.out.println("Test driving bwm");
	}
	@Test (groups = {"benz"})
	public void benz() {
		System.out.println("Test driving benz");
	}
	@Test (groups = {"benz"})
	public void benzcla() {
		System.out.println("Test driving benz");
	}
	@Test (groups = {"porche"})
    public void porcheA65() {
	System.out.println("Test driving porche");
    }	
	@Test (groups = {"porche"})
    public void porche() {
	System.out.println("Test driving porche");
    }

	
	
}
