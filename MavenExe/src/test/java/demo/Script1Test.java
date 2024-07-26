package demo;

import org.testng.annotations.Test;

public class Script1Test {

	@Test
	public void m1()
	{
		String Browser = System.getProperty("browser");
		System.out.println(Browser);
		/*String URL = System.getProperty("url");
		System.out.println(URL);*/
		//mvn -Dkey1=value1 -Dkey2= value2 test*/
		System.out.println("hi");

	}
}
