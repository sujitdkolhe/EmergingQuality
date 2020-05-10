package Com.TestingShatr.RegressionTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.TestingShatra.Keywords.Amazon_Pom;
import Com.TestingShatra.Keywords.Constant;
import Com.TestingShatra.Keywords.Keyword;

public class Amazon_Pom_Test {
	static Amazon_Pom ap=new Amazon_Pom();
	@BeforeTest
	public void tc_01() {
		Keyword.openBrowser("Chrome");
	}
	@Test
	public void tc_02() {
		Keyword.openURL("https://www.amazon.in/");
	}
	
	@Test
public static void tc_03() {
	ap=PageFactory.initElements(Constant.driver, Amazon_Pom.class);
	ap.click_On_Amazon_Pay();

}

}
