package testCases;

import org.testng.annotations.AfterMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestcase {
	WebDriver driver;
	Properties p;
	@BeforeMethod
	public void setup() throws IOException
	{
		FileInputStream file= new FileInputStream(".//src//test//resources//TestData.properties");
		p=new Properties();
		p.load(file);
		driver=new ChromeDriver();
		driver.get(p.getProperty("appurl"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
