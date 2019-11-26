package seleniumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
public static void main(String[] args) throws IOException, AWTException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiyanz\\eclipse-workspace\\sree\\seleniumproject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.manage().window().maximize();
	WebElement firstloc = driver.findElement(By.name("firstName"));
	firstloc.sendKeys("jayasree");
	WebElement lastloc = driver.findElement(By.id("lastName"));
	lastloc.sendKeys("T");
	WebElement next = driver.findElement(By.xpath("// span[@class=('RveJvd snByac')]"));
	next.click();
	TakesScreenshot jjg=(TakesScreenshot)driver;
	File src=jjg.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Shiyanz\\Pictures\\Saved Pictures\\gmail.png");
	FileUtils.copyFile(src,des);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	driver.quit();
	
}
}
	