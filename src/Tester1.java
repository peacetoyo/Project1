import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.payercompass.com/");
         driver.get("google.com/");
     
         
         System.out.println(driver.getTitle());
         driver.findElement(By.linkText("Price Map")).click();
         
	}

}
