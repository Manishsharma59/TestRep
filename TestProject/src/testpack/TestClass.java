package testpack;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TestClass {
	
	public static WebDriver driver;
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("no-sandbox");
	chromeOptions.addArguments("disable-extensions");
	chromeOptions.addArguments("start-maximized");
	driver = new ChromeDriver(chromeOptions);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://intranet.xavient.com/");
	driver.findElement(By.name("txtLoginName")).sendKeys("msharma13");
	driver.findElement(By.name("txtPassword")).sendKeys("Wizardry@123");
	driver.findElement(By.name("btnLogin")).sendKeys(Keys.ENTER);
	
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//*[@title='My Zone']/a/i"))).build().perform();
	driver.findElement(By.xpath("//li[@title='Leave']")).click();
	driver.findElement(By.xpath("//li[@title='Apply Leave']")).click();
	Select leaveType = new Select(driver.findElement(By.id("optLeaveType")));
	leaveType.selectByIndex(1);
	
	JavascriptExecutor oJse = (JavascriptExecutor)driver;
	oJse.executeScript("window.scrollBy(0,250)","");
	
	selectDateFrom(driver,"20/Feb/2018");
	
	selectDateTo(driver,"20/Feb/2018");

	
}


public static void selectDateFrom(WebDriver driver, String date) {
	
	
	
	String[] dateSplit = date.split("/");
	
	String dat = dateSplit[0];
	String month = dateSplit[1];
	String year = dateSplit[2];
	driver.findElement(By.xpath("//*[@id='Fromdatetimepicker']/span/button")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/thead/tr/th[2]")).click();
	//driver.findElement(By.xpath("//div[@id='Fromdatetimepicker']//span[@class='input-group-btn']//button[@class='btn default date-set']")).click();
	driver.findElement(By.xpath("//span[contains(@class,'year') and text()='"+year+"']")).click();
	driver.findElement(By.xpath("//span[contains(@class,'month') and text()='"+month+"']")).click();
	driver.findElement(By.xpath("//td[contains(@class,'day') and text()='"+dat+"']")).click();
} 

public static void selectDateTo(WebDriver driver, String date) {
	
	String[] dateSplit = date.split("/");
	
	String dat = dateSplit[0];
	String month = dateSplit[1];
	String year = dateSplit[2];
	driver.findElement(By.xpath("//*[@id='Todatetimepicker']/span/button")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/thead/tr/th[2]")).click();
	//driver.findElement(By.xpath("//div[@id='Fromdatetimepicker']//span[@class='input-group-btn']//button[@class='btn default date-set']")).click();
	driver.findElement(By.xpath("//span[contains(@class,'year') and text()='"+year+"']")).click();
	driver.findElement(By.xpath("//span[contains(@class,'month') and text()='"+month+"']")).click();
	driver.findElement(By.xpath("//td[contains(@class,'day') and text()='"+dat+"']")).click();
} 

public static void selectCurrentDate(WebDriver driver) {
	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat calenderDate1 = new SimpleDateFormat("dd/MMM/yyyy");
	
	String calenderDate = calenderDate1.format(cal.getTime());
	
	System.out.println(calenderDate1.format(cal.getTime()));
	
	String[] dateSplit = calenderDate.split("/");
	
	String dat = dateSplit[0];
	String month = dateSplit[1];
	String year = dateSplit[2];
	
}


}


