package com.automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoUpdateDriver {
	WebDriver driver;

	@Test(priority=3)
	public void test1() {
		AutoUpdateDriver obj = new AutoUpdateDriver();
		driver = obj.getChromeDriver();
		driver.get("https://www.google.co.in/");

	}

	@Test(priority=1)
	public void test2() {
		System.out.println("Test second");
	}

	@Test(priority=2)
	public void test3() {
		System.out.println("Test First");
	}

	private static WebDriver getChromeDriver() { //
		// System.setProperty("webdriver.chrome.driver", DRIVER_DIR +
		// "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

}
