package testCases;

import org.testng.annotations.AfterMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestcase {
	WebDriver driver;
	Properties p;
	@BeforeMethod
	@Parameters({"browser"})
	public void setup(String br) throws IOException
	{
		FileInputStream file= new FileInputStream(".//src//test//resources//TestData.properties");
		p=new Properties();
		p.load(file);
		if(br.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		if(br.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get(p.getProperty("appurl"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
