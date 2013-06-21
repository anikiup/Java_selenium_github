import static org.junit.Assert.*;

import java.io.File;//We need to put the IE Driver path

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class myfirstTest {
	
	
	@Test
	public void startWebDriver(){
		
		//WebDriver driver = new FirefoxDriver();
		File file = new File("E:/My Box Files/IEDriverServer_Win32_2.30.2/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver1 = new InternetExplorerDriver();
		//WebDriver driver2 = new ChromeDriver();
		
		driver1.navigate().to("http://sdv-qcwinweb2/");
		
		driver1.findElement(By.id("ctl11_txtUserName")).clear();
		driver1.findElement(By.id("ctl11_txtUserName")).sendKeys("nzaman@3ht.com");
	    driver1.findElement(By.id("ctl11_txtPassword")).clear();
	    driver1.findElement(By.id("ctl11_txtPassword")).sendKeys("Password!23NZ");
	    driver1.findElement(By.id("ctl11_btnLogOn")).click();
	    
	    //debug next steps
	    assertEquals("Federal Real Property Profile", driver1.getTitle());
	    //driver1.findElement(By.linkText("Search")).click();
	    //driver1.findElement(By.linkText("Add Asset")).click();
	    //driver1.findElement(By.linkText("Search")).click();
	  
	    //driver1.findElement(By.linkText("Admin")).clear();
	    
	    driver1.findElement(By.partialLinkText("Admin")).clear();
//	    driver1.findElement(By.title("Admin")).click();
	    driver1.findElement(By.linkText("Search User")).click();
	    driver1.findElement(By.name("ctl11$txtUserName")).clear();
	    driver1.findElement(By.name("ctl11$txtUserName")).sendKeys("ecommon");
	    // regular expression later  driver1.findElement(By.id(\ctl1+\))
		
	}

}
