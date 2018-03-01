package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.HomePage;

public class ValidLogin extends BaseTest {
	
	@Test
	public void testValidLogin(){
		
		HomePage h=new HomePage(driver);
		h.clickOnpopUpLocation();
		h.clickOnLogin();
		h.setMobOrEmail("9890308367");
		h.clickOncontinueBtn();
		h.setPassword("Msp430$mc");
		h.clickOnLoginBTN();
	}

}
