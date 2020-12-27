import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Program Files\\IEDriverServer.exe" );
         WebDriver driver=new InternetExplorerDriver();
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         driver.get("https://www.google.com/");
         System.out.println(driver.getTitle());
	}

}
