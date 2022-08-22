package com.automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoUpdateDriver {
	WebDriver driver;

	@Parameters("Browser")
	@Test(priority = 3)
	public void startBrowser(String browserName) {
		System.out.println("Parameter value is " + browserName);
		AutoUpdateDriver obj = new AutoUpdateDriver();
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = obj.getChromeDriver();
		}
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = obj.getFireFoxDriver();
		}
		driver.get("https://www.google.co.in/");
		driver.quit();
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("Test second");
	}

	@Test(priority = 2)
	public void test3() {
		System.out.println("Test First");
	}

	private static WebDriver getChromeDriver() { //
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	private static WebDriver getFireFoxDriver() { //
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
	
	private static WebDriver getEdgeDriver() { //
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}

}
