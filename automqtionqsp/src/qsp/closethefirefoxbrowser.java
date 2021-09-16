package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class closethefirefoxbrowser {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		new FirefoxDriver().close();
		
		

	}

}
