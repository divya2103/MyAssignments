package week2.homeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		/* Maximize the browser window */
		driver.manage().window().maximize();
		/* ImplicityWait */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/* Click on a radio button */
		WebElement element = driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]"));
		element.click();
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
		/* Click on the same radio button again to verify that the option unselected or not */
			driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]")).click();
		WebElement	src =driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]"));
				src.click();
	if(src.isEnabled())	
	{
		System.out.println("The radio button is selected");
	}
	else
	{ 
		System.out.println("The radio button is unselected");
	
	}
	
	/* Find the radio button which is initially selected by default */
	WebElement selectByDefault = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]"));
	if(selectByDefault.isEnabled())	
	{
		System.out.println("The radio button is selected by default");
	}
	else
	{ System.out.println("The radio button is unselected");
	}
	
	/* Check and select the age group (21-40 Years) if not selected already */
	WebElement select = driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]"));
	if(select.isEnabled())	
	{
		System.out.println("The age group (21-40 Years) is already selected");
	}
	else
	{ System.out.println("The age group (21-40 Years) is not selected");
	}
	driver.close();
	}
}
