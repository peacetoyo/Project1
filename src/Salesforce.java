import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
         WebDriver driver=new ChromeDriver();

         driver.get("https://login.salesforce.com/");
         driver.get("https://login.Facebook.com/");
         driver.get("https://login.Amazon.com/");
         driver.get("https://www.google.com/");;

         driver.get("https://login.Facebook.com/");

         System.out.println(driver.getTitle());
         driver.findElement(By.id("username")).sendKeys("gabriel.toyo@outlook.com");
         driver.findElement(By.id("password")).sendKeys("Il0vemylife45");
         driver.findElement(By.id("Login")).click();
         driver.findElement(By.linkText("Home Tab")).click();
         
         

	}

}
