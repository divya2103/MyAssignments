package week2.homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Divya");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Selvaraj");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Div");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Engineering");
		driver.findElement(By.xpath("(//textarea[@name='description'])[1]")).sendKeys("Test lead");
		driver.findElement(By.name("primaryEmail")).sendKeys("divyaraj2623@gmail.com");
		
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(state);
		option.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("Divya");
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='lastName'])[3]")).sendKeys("Selvaraj");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@id='ext-gen879']/table/tbody[1]/tr[1]/td[1]/div/a")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Noted");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.close();
		
	}

}
