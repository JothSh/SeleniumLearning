package onesample;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test (enabled = true)
	public void tenth() {
	System.out.println("Tenth Pass");
	}
	@Test (dependsOnMethods = "tenth")
	public void higherSecondary() {
		System.out.println("Higher secondary school");
	}
	@Test (dependsOnMethods = "higherSecondary")
	public void college() {
		System.out.println("Studying college");
	}
	
	
	
	
	
	
}
