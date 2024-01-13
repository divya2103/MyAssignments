package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options = new Select(dropDown);
		options.selectByIndex(4);
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select options1 = new Select(dropDown1);
		options1.selectByVisibleText("Automobile");
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options2 = new Select(dropDown2);
		options2.selectByValue("OWN_CCORP");
		System.out.println("Title of the page: " + driver.getTitle());
		driver.close();
	}

}
