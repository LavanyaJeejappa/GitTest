import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("lavanyajlav");
		driver.findElement(By.id("pass")).sendKeys("lav888");*/
		
		driver.get("https://www.google.co.in");
		driver.get("https://www.gmail.com");
		
	    System.out.println("launched all browsers");
		
	}

}
