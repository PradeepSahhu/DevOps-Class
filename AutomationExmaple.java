


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;



public class AutomationClass {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/pradeepsahu/Desktop/selenium\ WebDriver\ Jars/chromedriver-mac-arm64/chromedriver");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("chandigarh University",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread t = new Thread();
		t.sleep(50000);
		driver.close();
//		driver.quit();

	}

}

