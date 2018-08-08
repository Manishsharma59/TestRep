package testpack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.jar.asm.commons.Method;

public class TestClass2 {
	
	//http://demoqa.com/datepicker/
	
	static WebDriver driver;
	static ExtentReports extent;
	static ExtentTest logger;
	
	static {
		
		extent = new ExtentReports(System.getProperty("user.dir")+"/Reports/ExtentReport"+System.currentTimeMillis()+".html",true);
		
		
	}
		
		public static void openBrowser(String browser) {
			logger = extent.startTest(""); 
			if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("no-sandbox");
			chromeOptions.addArguments("disable-extensions");
			chromeOptions.addArguments("start-maximized");
			driver = new ChromeDriver(chromeOptions);
			logger.log(LogStatus.INFO, "Chrome browser opened");
			}
			
			else if(browser.equalsIgnoreCase("FireFox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				logger.log(LogStatus.INFO, "Firefox browser opened");
				}
			
			else if(browser.equalsIgnoreCase("Internet Explorer")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driver\\internerExplorerdriver.exe");
				driver = new InternetExplorerDriver();
				logger.log(LogStatus.INFO, "Internet Explorer browser opened");
				
			}
		}
		public static void openApplication() {
			driver.get("http://demoqa.com/datepicker/");
			//driver.manage().window().maximize();
			logger.log(LogStatus.INFO, "Application opened");
			extent.endTest(logger);
		}
		
		
		
		public static String currentDate() {
			
			DateFormat calenderDateFormat = new SimpleDateFormat("dd/MMMMM/yyyy");
			Calendar cal = Calendar.getInstance();
			String date = calenderDateFormat.format(cal.getTime());
			
			
			//Date calenderDate = calenderDateFormat.format(cal.getTime());
			return date;
			
		}
		
		public static String getSystemDate(int offset) {
			SimpleDateFormat calenderDateFormat = new SimpleDateFormat("dd/MMMMM/yyyy");
	        Calendar cal = Calendar.getInstance();
	        
	        cal.add(Calendar.DATE, offset);   
	        String fromdate = calenderDateFormat.format(cal.getTime());
			
			return fromdate;
		}
		
		public static void selectPreviuosDate(int previousDate) {
			
			driver.findElement(By.name("selected_date")).click();
			String systemDate = getSystemDate(previousDate);
			
			String systemDateArray[] = systemDate.split("/");
			String date = systemDateArray[0];
			String month = systemDateArray[1];
			String year = systemDateArray[2];
			String monthYear = month+" "+year;
			System.out.println(date);
			System.out.println(month);
			System.out.println(year);
			System.out.println(monthYear);
			
			System.out.println(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText());
			while(!(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText().equals(monthYear))) {
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]//span")).click();
			
			}
			driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		}
		
public static void selectFutureDate(int futureDate) {
			
			driver.findElement(By.id("ui-id-2")).click();
			driver.findElement(By.id("datepicker2")).click();
			String systemDate = getSystemDate(futureDate);
			
			String systemDateArray[] = systemDate.split("/");
			String date = systemDateArray[0];
			String month = systemDateArray[1];
			String year = systemDateArray[2];
			String monthYear = month+" "+year;
			System.out.println(date);
			System.out.println(month);
			System.out.println(year);
			System.out.println(monthYear);
			
			System.out.println(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText());
			while(!(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText().equals(monthYear))) {
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			
			}
			driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		}

public static void  datePractice() throws ParseException {
	Calendar cal= Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String currenDate = sdf.format(cal.getTime());
    Date date1 = sdf.parse(currenDate);
    Date date2 = sdf.parse("2010-01-31");

    System.out.println("date1 : " + sdf.format(date1));
    System.out.println("date2 : " + sdf.format(date2));

    if (date1.compareTo(date2) > 0) {
        System.out.println("Date1 is after Date2");
    } else if (date1.compareTo(date2) < 0) {
        System.out.println("Date1 is before Date2");
    } else if (date1.compareTo(date2) == 0) {
        System.out.println("Date1 is equal to Date2");
    } else {
        System.out.println("How to get here?");
    }

}

public static void quitAll() {
	
	extent.flush();
	extent.close();
	
}
		
public static void main(String[] args) {
	
	openBrowser("Chrome");
	openApplication();
	extent.flush();
	
	
	
}

}
