package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.vel.config.Configurations;

public class ListBox3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configurations.driverPath);
		WebDriver driver = new ChromeDriver();	
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		
		WebElement year = driver.findElement(By.xpath("//Select[@name='birthday_month']"));
		
		Select sel = new Select(year);
		
	    int len = sel.getOptions().size();
		
		System.out.println(len);
		
	
			
		 String ele = sel.getOptions().get(5).getText();
		System.out.println(ele);
	
	}

}
