package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookXpath {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Dhanusha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007772%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeapo3svdtUXjclQRgyOBPZCG9JB6SaeVf-xwztKoQrzB2cle5lBJsBoCCxgQAvD_BwE");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Jhon");
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("AK");
		driver.findElement(By.name("reg_email__")).sendKeys("jhonak@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jhonak@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123667741");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("birthday_day")).sendKeys("17");
		driver.findElement(By.name("birthday_month")).sendKeys("Aug");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
		}

		}






