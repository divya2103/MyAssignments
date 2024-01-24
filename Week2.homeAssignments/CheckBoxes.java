package week2.homeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		/* Maximize the browser window */
		driver.manage().window().maximize();
		/* ImplicityWait */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select the Basic checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();

		// Select the Notification checkbox and verify the expected message
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String expectedMessage = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if (expectedMessage.equals("Checked")) {
			System.out.println("Expected message is: " + expectedMessage);
		} else {
			System.out.println("Expected message is not displayed");
		}
        // Click on the favorite language
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();

		// Verify which tri-state option has been chosen
		driver.findElement(By.xpath("//div[@class='col-12']/div[@id='j_idt87:ajaxTriState']")).click();

		String triStateOption = driver.findElement(By.xpath("//p[contains(text(),'State =')]")).getText();
		System.out.println("TriState option: " + triStateOption);

		// Click on toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String expectedMsg = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if (expectedMsg.equals("Checked")) {
			System.out.println("Expected message is: " + expectedMsg);
		} else {
			System.out.println("Expected message is not displayed");
		}
		boolean checkBox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isDisplayed();
		System.out.println("Is checkbox is displayed: " + checkBox);

		// Select multiple options
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']"))
				.click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.close();

	}

}
