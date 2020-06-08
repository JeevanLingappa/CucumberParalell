package stepDefinations;

import org.junit.AfterClass;

import io.cucumber.java.After;

public class Hooks {
	
	@After("@MultiCheckBox")
	public void tearDown() {
		
		System.out.println("CLosing the browser");
	}

}
