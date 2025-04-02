
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
public class testautomationpractice2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Http://Google.com");
		driver.get("Http://testautomationpractice.blogspot.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("window.scrollBy(0,1300);");
		Thread.sleep(4000);
		
		driver.findElement(By.id("datepicker")).sendKeys("5/03.2025");
		//Thread.sleep(2000);
		driver.findElement(By.id("txtDate")).sendKeys("10/06/2026");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("start-date")).sendKeys("11/12/2025");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("end-date")).sendKeys("15/02/2025");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("field2")).sendKeys("PIYUSH SINGH");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		
		JavascriptExecutor js1 =  (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(1300,1400);");
		 //Thread.sleep(2000);
		
		driver.findElement(By.id("apple")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("ac-ls-continue")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='button button-elevated button-primary']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='detail-ctas-link button']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='globalnav-link-text-container']")).click();
		//Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
