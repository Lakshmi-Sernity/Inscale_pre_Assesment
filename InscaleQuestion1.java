import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InscaleQuestion1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pslak\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
	        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	        
	        Thread.sleep(2000);
	        
	    
	        
	        WebElement bankManagerButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button"));
	        
	        bankManagerButton.click();
	        Thread.sleep(2000);
	        
	        
	        
	        WebElement addCustomerButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
	        
	        addCustomerButton.click();
	        Thread.sleep(2000);
	        
	        //1st customer

	         //Input  firstName
	        WebElement cus1FirstName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	        
	        cus1FirstName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Christopher");
	        
	    
	      //Input lasttName
	        
	        WebElement cus1LastName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	        
	        cus1LastName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Connely");       
	        
	        
	      //Input PostCode
	        
	        WebElement cus1PostCode =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	        
	        cus1PostCode.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");       
	       
	        Thread.sleep(2000);
	        
	       
	        //Add Customer
	   

	        WebElement cus1AddButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	        
	        cus1AddButton.click();
	        
	        Alert alert1 = driver.switchTo().alert();
	        alert1.accept();
	        
	        

	        
	        //2nd Customer

	         //Input  firstName
	        WebElement cus2FirstName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	        
	        cus2FirstName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Frank");
	        
	    
	      //Input lasttName
	        
	        WebElement cus2LastName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	        
	        cus2LastName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Christopher");       
	        
	        
	      //Input PostCode
	        
	        WebElement cus2PostCode =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	        
	        cus2PostCode.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("A897N450");       
	       
	        Thread.sleep(2000);
	        
	       
	        //Add Customer
	   

	        WebElement cus2AddButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	        
	        cus2AddButton.click();
	        
	        Alert alert2 = driver.switchTo().alert();
	        alert2.accept();
	        
	        
	        
	        //3rd Customer

	         //Input  firstName
	        WebElement cus3FirstName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	        
	        cus3FirstName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Christopher");
	        
	    
	      //Input lasttName
	        
	        WebElement cus3LastName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	        
	        cus3LastName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Minka");       
	        
	        
	      //Input PostCode
	        
	        WebElement cus3PostCode =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	        
	        cus3PostCode.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("M098Q585");       
	       
	        Thread.sleep(2000);
	        
	       
	        //Add Customer
	   

	        WebElement cus3AddButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	        
	        cus3AddButton.click();
	        
	        Alert alert3 = driver.switchTo().alert();
	        alert3.accept();
	        
	        
	        
	        //4th Customer

	         //Input  firstName
	        WebElement cus4FirstName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	        
	        cus4FirstName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Connely");
	        
	    
	      //Input lasttName
	        
	        WebElement cus4LastName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	        
	        cus4LastName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Jackson");       
	        
	        
	      //Input PostCode
	        
	        WebElement cus4PostCode =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	        
	        cus4PostCode.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");       
	       
	        Thread.sleep(2000);
	        
	       
	        //Add Customer
	   

	        WebElement cus4AddButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	        
	        cus4AddButton.click();
	        
	        Alert alert4 = driver.switchTo().alert();
	        alert4.accept();
	        
	        
	      //5th Customer

	         //Input  firstName
	        WebElement cus5FirstName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	        
	        cus5FirstName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Jackson");
	        
	    
	      //Input lasttName
	        
	        WebElement cus5LastName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	        
	        cus5LastName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Frank");       
	        
	        
	      //Input PostCode
	        
	        WebElement cus5PostCode =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	        
	        cus5PostCode.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");       
	       
	        Thread.sleep(2000);
	        
	       
	        //Add Customer
	   

	        WebElement cus5AddButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	        
	        cus5AddButton.click();
	        
	        Alert alert5 = driver.switchTo().alert();
	        alert5.accept();
	        
	        
	        
	        
		      //6th Customer

	         //Input  firstName
	        WebElement cus6FirstName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	        
	        cus6FirstName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Minka");
	        
	    
	      //Input lasttName
	        
	        WebElement cus6LastName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	        
	        cus6LastName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Jackson");       
	        
	        
	      //Input PostCode
	        
	        WebElement cus6PostCode =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	        
	        cus6PostCode.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("A897N450");       
	       
	        Thread.sleep(2000);
	        
	       
	        //Add Customer
	   

	        WebElement cus6AddButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	        
	        cus6AddButton.click();
	        
	        Alert alert6 = driver.switchTo().alert();
	        alert6.accept();
	        
	        
	        
	        
		      //7th Customer

	         //Input  firstName
	        WebElement cus7FirstName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	        
	        cus7FirstName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Jackson");
	        
	    
	      //Input lasttName
	        
	        WebElement cus7LastName =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	        
	        cus7LastName.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Connely");       
	        
	        
	      //Input PostCode
	        
	        WebElement cus7PostCode =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	        
	        cus7PostCode.click();
	            
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");       
	       
	        Thread.sleep(2000);
	        
	       
	        //Add Customer
	   

	        WebElement cus7AddButton =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	        
	        cus7AddButton.click();
	        
	        Alert alert7 = driver.switchTo().alert();
	        alert7.accept();
	        
	        Thread.sleep(2000);
	        
	        //Navigate to Customer Tab
	        		
          WebElement cusTab =   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]"));
	        
	        cusTab.click();
	        
	        //search for the cust1
	        Thread.sleep(2000);
	        
	         driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("Christopher"+Keys.ENTER);
	         

	}

}
