package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseClass {
	
	public WebDriver driver;
	public Logger logger; //Log4j
	public Properties prop;
	
	@BeforeMethod
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	
	{
	
		//Loading config.properties file
	//	FileReader file = new FileReader(".src//test//resources//config.properties");
		prop=new Properties();
		FileReader file= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop.load(file);
		
		
		logger=LogManager.getLogger(this.getClass());
		
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver= new FirefoxDriver(); break;
		
		default : System.out.println("Invalid browser name......."); return;
		
		}
		
		
		driver.get(prop.getProperty("url")); //reading browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
