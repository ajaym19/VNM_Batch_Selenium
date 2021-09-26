package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	/*
	 * Annotations 
	 * 
	 * Tags:
	 * BeforeSuite
	 * BeforeTest
	 * BeforeClass
	 * BeforeMethod
	 * 
	 * Test Case
	 * 
	 * AfterMethod
	 * AfterClass
	 * AfterTest
	 * AfterSuite
	 * 
	 * 
	 * 
	 * Login class
	 * 3 TC
	 * tc1
	 * tc2
	 * tc3
	 * 
	 * beforeclass
	 * before method
	 * after method
	 * 3 TC
	 * afterclass
	 * 
	 * 1st Before Class 
	 * 
	 * Before method
	 * TC1
	 * AfterMethod
	 * 
	 * Before method
	 * TC2
	 * AfterMethod
	 * 
	 * Before method
	 * TC3
	 * AfterMethod
	 * 
	 * After Class
	 * 
	 * 
	 * Launching Browser and Application
	 * Validating Title
	 * Closing the application and browser
	 * 
	 * login TC
	 * 1000 TC
	 * 
	 */
	
	@BeforeClass
	public void doingConfiguration() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Launching Browser and Application");
	}
	
	@Test(priority = 1)
	public void validateTitle() {
		System.out.println("Validating Title");
	}
	
	@Test (priority = 2)
	public void validateLogin() {
		System.out.println("Validating Login");
	}
	
	@Test (priority = 3)
	public void a() {
		System.out.println("A");
	}
	
	@Test
	public void sendFriendRequest() {
		System.out.println("Sending Friend Request");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = "sendFriendRequest")
	public void receiveFriendRequest() {
		System.out.println("Receiving Friend Request");
	}
	
	@AfterMethod
	public void closeSetUp() {
		System.out.println("Closing the application and browser");
	}
	
	@AfterClass
	public void deletingCookies() {
		System.out.println("After Class");
	}
	
	
	
	
	
}
