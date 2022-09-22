package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Dhanusha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/EI13105/Downloads/WebTable.html");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input[@type='checkbox']")).click();
		}

		}
