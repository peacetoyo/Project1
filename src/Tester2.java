import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe" );
         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         System.out.println(driver.getTitle());

	}

}
