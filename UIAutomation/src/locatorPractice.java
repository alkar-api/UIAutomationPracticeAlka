import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPractice
{
    public static void main(String[] args) throws InterruptedException {

   System.out.println("h");
   System.setProperty("webdriver.chrome.driver","C:\\Users\\jayde\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com");
   driver.findElement(By.id("email")).sendKeys("testemail");
   driver.findElement(By.name("pass")).sendKeys("testpwd");
   driver.findElement(By.name("login")).click();
   System.out.println(driver.getTitle());
   driver.close();
}
}
