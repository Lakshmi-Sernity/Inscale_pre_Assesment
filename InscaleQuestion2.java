import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InscaleQuestion2 {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pslak\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
	        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	        
	        Thread.sleep(2000);
	         
	        // click on customer login 
	        WebElement customerLogin  =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button"));
	        
	        customerLogin.click();
	        Thread.sleep(2000);
	        
	        //select Hermoine Granger name from the dropdown
	        WebElement	yourNameDropdown = 	driver.findElement(By.name("userSelect"));
	        
	       Select dropDown = new Select(yourNameDropdown);
	       dropDown.selectByIndex(1);
	        Thread.sleep(2000);
	        
	        //click on login button
	        
            WebElement loginButton  =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button"));	        
	        loginButton.click();
	        Thread.sleep(2000);
	        
	        //Select 1003 from the dropdown
	        
	        WebElement	numberDropdown = 	driver.findElement(By.id("accountSelect"));
	        
	       Select dropDown1 = new Select(numberDropdown);
	       dropDown1.selectByIndex(2);
	        Thread.sleep(2000);
	        
	        //click on Deposit Tab
            WebElement depositTab  =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]"));	        
	        depositTab.click();
	        Thread.sleep(2000);
	        //input Amount be to be deposited
	        
	       driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("50000");
	           
             Thread.sleep(2000);

	      //click on deposit button
            WebElement depositButton1 =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));	        
	        depositButton1.click();
	        
	        // display the current balance
	        
	        
		
	}

}
