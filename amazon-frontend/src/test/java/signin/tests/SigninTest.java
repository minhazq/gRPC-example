package signin.tests;


import org.testng.annotations.Test;

import framework.TestScriptBase;

public class SigninTest extends TestScriptBase{

	@Test
	public void SignInTest(){
		amazon().getHeader().signIn("Test", "Test");
	}

}
