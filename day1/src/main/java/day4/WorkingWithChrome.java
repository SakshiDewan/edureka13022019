package day4;
//import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome{
	ChromeDriver driver;

	public void invokeBrowser()
	{
				
		System.setProperty("webdriver.chrome.driver","C:/Users/sakshi/Downloads/chromedriver.exe");

		driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
	}
	
//	public void closebrowser()
//	{
//		
//		driver.close();
//		
//	}
//	
	

}
