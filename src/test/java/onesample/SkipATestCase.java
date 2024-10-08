package onesample;

import org.testng.annotations.Test;

public class SkipATestCase {

	@Test (priority=0)
	public void startTheCar(){
		
		System.out.println("The car is on Now ");
	
	}
	@Test (priority=2,enabled=true)
	public void musicIsOn() {
		System.out.println("The music is on now");
	}
	@Test(priority=1)
	public void carAtHighSpeed(){
		System.out.println("THe cra is at high speed");
	}
	
	
	
}
