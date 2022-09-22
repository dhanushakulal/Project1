package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Dhanusha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9050529%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeQOQjMecRk2j5FvrrkdflohnKvfY8qV4a-BMEdYDIjGen0tHQbtksRoCPJEQAvD_BwE");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Dhanusha");
		driver.findElement(By.name("surname")).sendKeys("Kulal");
		
		driver.findElement(By.name("obilenumber")).sendKeys("1234567898");
	
		driver.findElement(By.name("Newpassword")).sendKeys("abc123");
	
		driver.findElement(By.name("Dateofbirth")).sendKeys("01/01/01");
	
		driver.findElement(By.name("Gender")).sendKeys("Female");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_s_vz\"]")).click();
		}

		}

