package week2.homeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		/* Maximize the browser window */
		driver.manage().window().maximize();
		/* ImplicityWait */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String confirmPage = driver.getTitle();
		if (confirmPage.equals("Dashboard")) {
			System.out.println("Title of the page is: " + confirmPage);
		} else {
			System.out.println("Title of the page is not a: " + confirmPage);
		}
		driver.navigate().back();

		boolean disabled = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		System.out.println("Button is enabled: " + disabled);

		String postionText = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getText();
		System.out.println("Position text is: " + postionText);

		WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']"));
		String getSaveText = saveButton.getText();
		String bgColor = saveButton.getCssValue("background-color");
		System.out.println("Save button text is: " + getSaveText);
		System.out.println("Save button bgcolor is: " + bgColor);

		WebElement heightAndWidth = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		Dimension size = heightAndWidth.getSize();
		System.out.println("Width is: " + size.getWidth());
		System.out.println("Height is: " + size.getHeight());

		driver.close();
	}

}
