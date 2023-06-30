package org.base;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	}

}
