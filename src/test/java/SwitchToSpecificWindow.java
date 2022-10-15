import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToSpecificWindow {
@Test
	public void getWindowSwitch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Thread.sleep(5000);
		
		String parentwindow=driver.getWindowHandle();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement linkedin=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")));
		linkedin.click();
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		List<String> Lwindows=new ArrayList(allwindows);
		
		for(String s:Lwindows)
		{
			String allTitles=driver.switchTo().window(s).getTitle();
			if(allTitles.contains("Facebook"))
			{
				System.out.println("found correct window and switch to that window");
				driver.switchTo().window(s);
				
				System.out.println("facebook window title :"+driver.getTitle());
			}
		}
		
		driver.quit();

	}

}
