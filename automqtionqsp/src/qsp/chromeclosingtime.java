package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeclosingtime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	Thread.sleep(10000);
	driver.close();
	
	
		

	}

}
