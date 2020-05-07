package Com.TestingShatr.RegressionTestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.TestingShatra.Keywords.Amazon_Pay_POM;
import Com.TestingShatra.Keywords.Amazon_Pom;
import Com.TestingShatra.Keywords.Constant;
import Com.TestingShatra.Keywords.Keyword;

public class Amazon_Pay_Pom_Test {
	
	
	static Com.TestingShatra.Keywords.Amazon_Pay_POM ap=new Com.TestingShatra.Keywords.Amazon_Pay_POM();
	static Com.TestingShatra.Keywords.Amazon_Pay_POM apt=new Com.TestingShatra.Keywords.Amazon_Pay_POM();
	
//		@BeforeTest
//		public void tc_01() {
//			Keyword.openBrowser("Chrome");
//		}
//		@Test
//		public void tc_02() {
//			Keyword.openURL("https://www.amazon.in/");
//		}
//		
//		@Test
//	public static void tc_03() {
//		ap=PageFactory.initElements(Constant.driver, Amazon_Pom.class);
//		ap.click_On_Amazon_Pay();
//
//	}
		@Test
		public static void tc_01() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_your_Transaction();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_02() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_COVID_19_Donation();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_03() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_on_emi();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_04() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_on_rewards();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_05() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_on_saves_cards();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_06() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_on_bank_Accounts();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_07() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_help_Faqs();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_08() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_mobile_reacharge();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_09() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_electricity();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_10() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_dTH_Recharge();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_11() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Mobile_Postpaid();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_12() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Bharat_Gas_Cylinder();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_13() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Piped_Gas();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_14() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Water_Bill();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_15() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Landline();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		
		@Test
		public static void tc_16() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Broadband();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		
		@Test
		public static void tc_17() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Municipal_Tax();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_18() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Flights();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_19() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Bus_Tickets();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_20() {
			
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Movie_Tickets();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_21() {
			
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Food_offers();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_22() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Gaming_offers();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_23() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Entertainment_offers();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_24() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Travel_offers();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		
		@Test
		public static void tc_25() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Health_and_fitness_offers();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_26() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Home_services_offers();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_27() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Gift_Cards();
			Keyword.implicit_Wait(5, "SECONDS");
			//Constant.driver.navigate().back();
			JavascriptExecutor js = ((JavascriptExecutor) Constant.driver);
			js.executeScript("window.scrollBy(0,500)");
		}
		
		@Test
		public static void tc_29() {
			JavascriptExecutor js = ((JavascriptExecutor) Constant.driver);
			js.executeScript("window.scrollBy(0,500)");
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Brand_Vouchers();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
			
		}
		@Test
		public static void tc_30() {
			JavascriptExecutor js = ((JavascriptExecutor) Constant.driver);
			js.executeScript("window.scrollBy(0,500)");
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Birthday_Giftcards();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_31() {
			JavascriptExecutor js = ((JavascriptExecutor) Constant.driver);
			js.executeScript("window.scrollBy(0,500)");
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Wedding_Giftcards();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_32() {
			JavascriptExecutor js = ((JavascriptExecutor) Constant.driver);
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Corporate_Gifting();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_33() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Add_Money();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_34() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Auto_Reload();	
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		@Test
		public static void tc_35() {
			apt=PageFactory.initElements(Constant.driver, Amazon_Pay_POM.class);
			apt.click_On_Account_Settings();
			Keyword.implicit_Wait(5, "SECONDS");
			Constant.driver.navigate().back();
		}
		
}
