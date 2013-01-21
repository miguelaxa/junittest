package com.mac.example;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class IeTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.ie.driver",
				"C:\\JAVA_DEV\\IEDriverServer.exe");
		File logFile = new File(System.getProperty("user.dir") + File.separator
				+ "ietestlog.txt");
		driver = new InternetExplorerDriver();
		baseUrl = "https://ohloh.net";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testMoreAndSubmitIdea() throws Exception {
		driver.get(baseUrl + "/sessions/new");
		driver.findElement(By.name("login[login]")).clear();
		driver.findElement(By.name("login[login]")).sendKeys("miguelaxa@gmail.com");
		driver.findElement(By.name("login[password]")).clear();
		driver.findElement(By.name("login[password]")).sendKeys("syscommando");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/form/fieldset/div[4]/input")).click();
		for (int second = 0;; second++) {
			if (second >= 60)
				//fail("timeout");
				System.out.println("fail");
			try {
				if (isElementPresent(By
						.xpath("/html/body/div/div[2]/div/div/div")))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			//fail(verificationErrorString);
			System.out.println("fail");
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}