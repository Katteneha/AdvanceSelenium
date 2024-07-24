package Practice;

import org.testng.annotations.Test;



public class Demo {
	
	@Test(invocationCount = 2)
	public void createContactTest() {
		System.out.println("Contact Created...");
	}

	@Test
	public void modifyContactTest() {
		System.out.println("Modify Created...");
	}
	
	@Test
	public void deleteContactTest() {
		System.out.println("Delete Created...");
	}
}
