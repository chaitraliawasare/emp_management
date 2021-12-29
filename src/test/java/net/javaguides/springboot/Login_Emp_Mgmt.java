package cloudbees.demo.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
public class Login_Emp_Mgmt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://3.108.238.59:8080/admin/logon.html");
		driver.navigate().to("http://13.233.15.229:8080/login");	
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	    //driver.findElement(By.id("formSubmitButton")).click();
	    driver.findElement(By.xpath("//a[@href='/registration']")).click();
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Peter");
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Parker");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("peterparker@tcs.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
	    driver.findElement(By.cssSelector("div.container:nth-child(4) div.row div.col-md-6.col-md-offset-3 form:nth-child(2) div.form-group:nth-child(6) > button.btn.btn-success:nth-child(1)")).click();
	    driver.navigate().to("http://13.233.15.229:8080/login");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("peterparker@tcs.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
	    driver.findElement(By.id("login-submit")).click();
	    //driver.findElement(By.);
	    //driver.navigate.to("http://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("javatpoint");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath(null));
	}
}
