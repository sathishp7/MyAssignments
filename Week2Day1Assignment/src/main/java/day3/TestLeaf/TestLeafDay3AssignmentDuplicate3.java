package day3.TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafDay3AssignmentDuplicate3 {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sathish_15");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathish");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Satz");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sathish");
	driver.findElement(By.className("inputBox")).sendKeys("Software IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("qwerty@gmail.com");
	WebElement stateDropDown = driver.findElement(By.name("generalStateProvinceGeoId"));
	stateDropDown.click();
	Select s = new Select(stateDropDown);
	s.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MAPS");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tommy");
		driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	
}
}
